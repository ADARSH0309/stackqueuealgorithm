package tests;

import src.PrintQueue;

public class TestPrintQueue {
    public static void main(String[] args) {
        PrintQueue pq = new PrintQueue();
        pq.enqueue("doc1");
        pq.enqueue("doc2");
        System.out.println(pq.dequeue()); // Expected Output: doc1
    }
}
