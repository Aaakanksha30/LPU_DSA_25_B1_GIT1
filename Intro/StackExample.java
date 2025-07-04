
public class StackExample {
   /*  public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Popping an element
        int popped = stack.pop();
        System.out.println("Popped: " + popped);

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }*/
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor
    public StackExample(int size) {  //Using array
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        StackExample stack = new StackExample(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();          

        System.out.println("Top element is: " + stack.peek());  

        stack.pop();             
        stack.display(); 
            
    }
   
}


