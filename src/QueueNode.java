class QueueNode {
    int data;
    QueueNode next;

    // Constructor for QueueNode
    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private QueueNode front;
    private QueueNode rear;
    private int size;

    // Constructor for Queue
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Enqueue method to add an element to the queue
    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (rear == null) {
            front = rear = newNode; // If the queue is empty
        } else {
            rear.next = newNode; // Add new element to the end
            rear = newNode; // Update rear
        }
        size++;
    }

    // Dequeue method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Or throw an exception
        }
        int dequeuedData = front.data; // Save front element value
        front = front.next; // Update front
        if (front == null) {
            rear = null; // If queue becomes empty
        }
        size--;
        return dequeuedData;
    }

    // Front method to return the front element of the queue
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Or throw an exception
        }
        return front.data; // Return front element value
    }

    // isEmpty method to check if the queue is empty
    public boolean isEmpty() {
        return front == null; // If front is null, queue is empty
    }

    // Size method to return the number of elements in the queue
    public int size() {
        return size; // Return current size
    }

    // Main method to test
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: " + queue.front()); // Output: 10

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: 10
        System.out.println("Front element after dequeue: " + queue.front()); // Output: 20

        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: false
        System.out.println("Size of the queue: " + queue.size()); // Output: 2
    }
}
