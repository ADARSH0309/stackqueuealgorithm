package src;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    private Queue<String> printQueue;

    public PrintQueue() {
        printQueue = new LinkedList<>();
    }

    public void enqueue(String document) {
        printQueue.add(document);
    }

    public String dequeue() {
        if (printQueue.isEmpty()) {
            System.out.println("Print Queue is empty");
            return "";
        }
        return printQueue.poll();
    }

    public boolean isEmpty() {
        return printQueue.isEmpty();
    }
}
