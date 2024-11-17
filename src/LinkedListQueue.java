package src;

class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int value) {
        data = value;
        next = null;
    }
}

public class LinkedListQueue {
    private QueueNode front;
    private QueueNode rear;

    public LinkedListQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int value) {
        QueueNode newNode = new QueueNode(value);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
