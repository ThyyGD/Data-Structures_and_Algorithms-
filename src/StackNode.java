class StackNode {
    int data;
    StackNode next;

    // Constructor for StackNode
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {
    private StackNode top;
    private int capacity; // For static stack implementation
    private int size;     // Current size of the stack

    // Constructor for MyStack
    public MyStack(int capacity) {
        this.top = null;
        this.capacity = capacity;
        this.size = 0;
    }

    // Push method to insert an element into the stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    // Top method to return the top element of the stack
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return top.data;
    }

    // isEmpty method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // isFull method to check if the stack is full
    public boolean isFull() {
        return size == capacity; // For static stack
    }

    // Print the stack for visualization
    public void printStack() {
        StackNode current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        MyStack stack = new MyStack(5); // Create a stack with capacity of 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // Output: 30 20 10

        System.out.println("Top element is: " + stack.top()); // Output: 30

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        stack.printStack(); // Output: 20 10

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        System.out.println("Is stack full? " + stack.isFull()); // Output: false
    }
}

