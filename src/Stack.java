import java.util.EmptyStackException;
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size; // Set the maximum size of the stack
        stackArray = new int[maxSize]; // Create an array to hold stack elements
        top = -1; // Initialize top to -1 indicating the stack is empty
    }

    public void push(int value) {
        if (top < maxSize - 1) { // Check if there is space in the stack
            stackArray[++top] = value; // Increment top and add value to the stack
        } else {
            System.out.println("Stack is full!"); // Notify that the stack is full
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw exception if stack is empty
        }
        return stackArray[top--]; // Return the top value and decrement top
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw exception if stack is empty
        }
        return stackArray[top]; // Return the top value without removing it
    }

    public boolean isEmpty() {
        return (top == -1); // Check if the stack is empty
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack with a maximum size of 5
        stack.push(10); // Push 10 onto the stack
        stack.push(20); // Push 20 onto the stack
        System.out.println("Top element: " + stack.peek()); // Display the top element
        System.out.println("Popped element: " + stack.pop()); // Pop the top element
        System.out.println("Top element after pop: " + stack.peek()); // Display the new top element
    }
}
