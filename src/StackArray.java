class StackArray {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to store stack elements
    private int top; // Position of the top element
    public StackArray(int size) {
        maxSize = size; // Initialize maximum size
        stackArray = new int[maxSize]; // Create the array
        top = -1; // Stack is empty
    }
    public void push(int value) {
        if (top < maxSize - 1) { // Check if the stack is full
            stackArray[++top] = value; // Add element to the top of the stack
        } else {
            throw new RuntimeException("Stack is full"); // Throw exception if full
        }
    }
    public int pop() {
        if (top >= 0) { // Check if the stack is empty
            return stackArray[top--]; // Get and remove the top element
        } else {
            throw new RuntimeException("Stack is empty"); // Throw exception if empty
        }
    }
    public int peek() {
        if (top >= 0) { // Check if the stack is empty
            return stackArray[top]; // Return the top element without removing it
        } else {
            throw new RuntimeException("Stack is empty"); // Throw exception if empty
        }
    }
    public boolean isEmpty() {
        return (top == -1); // Check if the stack is empty
    }
    public int size() {
        return top + 1; // Return the number of elements in the stack
    }
}
class main {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5); // Tạo stack với kích thước 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek()); // Xuất: 30
        System.out.println("Stack size: " + stack.size()); // Xuất: 3

        System.out.println("Popped element: " + stack.pop()); // Xuất: 30
        System.out.println("New top element: " + stack.peek()); // Xuất: 20
        System.out.println("Is stack empty? " + stack.isEmpty()); // Xuất: false

        stack.pop(); // Xóa 20
        stack.pop(); // Xóa 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // Xuất: true
    }
}
