public class Node {
    int data;
    Node next;

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public class GfG {

        public static void printList(Node n) {

            // Iterate till n reaches null
            while (n != null) {

                // Print the data
                System.out.print(n.data + " ");
                n = n.next;
            }
        }

        public static void main(String[] args) {

            //Linked List 1 -> 2 -> 3
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);

            head.next = second;
            second.next = third;
            printList(head);
        }
    }
}




