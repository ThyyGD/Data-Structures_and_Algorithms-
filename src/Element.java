class Element {
    int data; // The data stored in the element
    Element next; // Pointer to the next element

    public Element(int data) {
        this.data = data;
        this.next = null; // Initialize next as null
    }
}
class LinkedStack {
    private Element top; // The top element of the stack
    private int size; // Size of the stack

    public LinkedStack() {
        this.top = null; // Initialize top as null
        this.size = 0; // Initialize size as 0
    }
    // Push an element onto the stack
    public void push(int data) {
        Element newElement = new Element(data); // Create a new element
        newElement.next = top; // Link new element to the previous top
        top = newElement; // Update top to the new element
        size++; // Increase the size
    }
    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int poppedData = top.data; // Get the data from the top element
        top = top.next; // Update top to the next element
        size--; // Decrease the size
        return poppedData; // Return the popped data
    }
    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data; // Return the data of the top element
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null; // Return true if top is null
    }
    // Get the size of the stack
    public int size() {
        return size; // Return the current size
    }
}

// Main class to test the stack implementation
//public class main {
//    public static void main(String[] args) {
//        LinkedStack stack = new LinkedStack(); // Create a new stack
//
//        stack.push(100);
//        stack.push(200);
//        stack.push(300);
//        System.out.println("Top element: " + stack.peek()); // Output: 300
//        System.out.println("Stack size: " + stack.size()); // Output: 3
//
//        System.out.println("Popped element: " + stack.pop()); // Output: 300
//        System.out.println("New top element: " + stack.peek()); // Output: 200
//        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
//
//        stack.pop(); // Remove 200
//        stack.pop(); // Remove 100
//        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
//    }
//}


