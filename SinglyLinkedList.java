public class SinglyLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at specific position (0-based index)
    public void insertAtPosition(int position, int data) {
        if (position < 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
    }

    // Delete at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete at specific position (0-based index)
    public void deleteAtPosition(int position) {
        if (position < 0 || head == null) {
            System.out.println("Invalid position or list is empty!");
            return;
        }

        if (position == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(1, 15);
        list.display();

        list.deleteAtBeginning();
        list.display();

        list.deleteAtEnd();
        list.display();

        list.deleteAtPosition(1);
        list.display();
    }
}
