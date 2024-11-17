package tests;

import src.ArrayQueue;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        System.out.println(queue.peek()); // Expected Output: 2
    }
}
