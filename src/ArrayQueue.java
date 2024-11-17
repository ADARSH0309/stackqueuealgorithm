package src;

public class ArrayQueue {
    private static final int SIZE = 100;
    private int front, rear, count;
    private int[] queue;

    public ArrayQueue() {
        front = 0;
        rear = -1;
        count = 0;
        queue = new int[SIZE];
    }

    public void enqueue(int value) {
        if (count >= SIZE) {
            System.out.println("Queue Overflow");
        } else {
            rear = (rear + 1) % SIZE;
            queue[rear] = value;
            count++;
        }
    }

    public void dequeue() {
        if (count <= 0) {
            System.out.println("Queue Underflow");
        } else {
            front = (front + 1) % SIZE;
            count--;
        }
    }

    public int peek() {
        if (count <= 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
