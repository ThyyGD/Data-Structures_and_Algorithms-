class ArrayQueue {
    private int[] queue; // Array to store queue elements
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int capacity; // Maximum capacity of the queue
    private int size; // Current size of the queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity]; // Initialize the array with the given capacity
        front = 0; // Initialize front index
        rear = -1; // Initialize rear index
        size = 0; // Initialize size
    }
    // Method to add an element to the queue
    public void enqueue(int data) {
        if (size == capacity) {
            throw new RuntimeException("Queue is full"); // Check if the queue is full
        }
        rear = (rear + 1) % capacity; // Increment rear index in a circular manner
        queue[rear] = data; // Add data at the rear
        size++; // Increase the size
    }
    // Method to remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty"); // Check if the queue is empty
        }
        int data = queue[front]; // Store the front element
        front = (front + 1) % capacity; // Increment front index in a circular manner
        size--; // Decrease the size
        return data; // Return the dequeued element
    }
    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0; // Returns true if the queue is empty
    }
    // Method to get the current size of the queue
    public int size() {
        return size; // Returns the current size
    }
}
