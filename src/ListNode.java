public class ListNode {
    int data;
    ListNode next;

    // ListNode constructor
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    ListNode head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at a specific position
    public void insertAtPosition(int data, int position) {
        ListNode newNode = new ListNode(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        ListNode current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Print the linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtBeginning(0);
        list.insertAtPosition(1, 1); // Insert 1 at position 1

        // Print the linked list
        list.printList(); // Output: 0 -> 1 -> 1 -> 2 -> null
    }
}
