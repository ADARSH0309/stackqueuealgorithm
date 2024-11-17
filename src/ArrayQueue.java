import java.util.*;

// Class to implement queue using array
class ArrayQueue {
    private static final int SIZE = 100; // Define the maximum size of the queue
    private int front, rear, count; // Variables to keep track of the front, rear, and count of elements in the queue
    private int[] queue; // Array to hold queue elements

    // Constructor to initialize the queue
    public ArrayQueue() {
        front = 0;
        rear = -1;
        count = 0;
        queue = new int[SIZE];
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (count >= SIZE) { // Check for queue overflow
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % SIZE; // Update the rear position circularly
        queue[rear] = value; // Add the element to the queue
        count++; // Increase the count of elements
    }

    // Method to remove an element from the queue
    public void dequeue() {
        if (count <= 0) { // Check for queue underflow
            System.out.println("Queue Underflow");
            return;
        }
        front = (front + 1) % SIZE; // Update the front position circularly
        count--; // Decrease the count of elements
    }

    // Method to peek at the front element of the queue
    public int peek() {
        if (count <= 0) { // Check if the queue is empty
            System.out.println("Queue is empty");
            return -1; // Indicate empty queue
        }
        return queue[front]; // Return the front element of the queue
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return count == 0; // Return true if the queue is empty
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();

        // Example usage
        q.enqueue(10); // Add 10 to the queue
        q.enqueue(20); // Add 20 to the queue
        System.out.println(q.peek()); // Should output 10
        q.dequeue(); // Remove the front element (10)
        System.out.println(q.peek()); // Should output 20
        q.dequeue(); // Remove the front element (20)
        System.out.println(q.isEmpty()); // Should output true (1)
    }
}
