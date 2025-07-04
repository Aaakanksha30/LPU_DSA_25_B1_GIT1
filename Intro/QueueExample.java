
public class QueueExample {
    //public static void main(String[] args) {
        /*Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.remove();  
        System.out.println("Front: " + q.peek()); 

        
        System.out.println("Rear: " + ((LinkedList<Integer>) q).getLast());*/

        //public class MyQueue {
    int[] arr;
    int front, rear;
    final int SIZE = 1000;

    // Constructor
    public QueueExample() {
        arr = new int[SIZE];
        front = 0;
        rear = -1;
    }

    // Enqueue method
    void enqueue(int x) {
        if (rear == SIZE - 1) {
            System.out.println("Queue overflow");
            return;
        }
        arr[++rear] = x;
    }

    // Dequeue method
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue underflow");
            return;
        }
        front++;
    }

    // Peek front element
    int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front > rear;
    }

    // Print queue contents
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        QueueExample q = new QueueExample();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        System.out.println("Front element: " + q.peek());
        q.display();
    }
}

    
