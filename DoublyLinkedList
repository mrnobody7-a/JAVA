class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        System.out.print("InsertAtBeginning: ");
        display();
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.print("InsertAtEnd (first element): ");
            display();
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        System.out.print("InsertAtEnd: ");
        display();
    }

    // Insert at specific position (1-based index)
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;

        System.out.print("InsertAtPosition(" + position + "): ");
        display();
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("DeleteAtBeginning: List is empty.");
            return;
        }
        head = head.next;
        if (head != null)
            head.prev = null;
        System.out.print("DeleteAtBeginning: ");
        display();
    }

    // Delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("DeleteAtEnd: List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("DeleteAtEnd (only one element): List is now empty.");
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.prev.next = null;
        System.out.print("DeleteAtEnd: ");
        display();
    }

    // Delete at specific position (1-based index)
    public void deleteAtPosition(int position) {
        if (position <= 0 || head == null) {
            System.out.println("DeleteAtPosition: Invalid position or empty list.");
            return;
        }

        if (position == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("DeleteAtPosition: Position out of bounds!");
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;

        System.out.print("DeleteAtPosition(" + position + "): ");
        display();
    }

    // Display the list
    public void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("--> Null");
    }

    // Main method for testing
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert operations
        dll.insertAtEnd(10);           // Insert at end
        dll.insertAtEnd(20);           // Insert at end
        dll.insertAtEnd(30);           // Insert at end
        dll.insertAtBeginning(5);      // Insert at beginning
        dll.insertAtPosition(15, 3);   // Insert at position 3

        // Delete operations
        dll.deleteAtBeginning();       // Delete from beginning
        dll.deleteAtEnd();             // Delete from end
        dll.deleteAtPosition(2);       // Delete from position 2
    }
}
