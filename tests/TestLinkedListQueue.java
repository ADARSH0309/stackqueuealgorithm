package tests;

import src.LinkedListQueue;

public class TestLinkedListQueue {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        System.out.println(queue.peek()); // Expected Output: 2
    }
}
