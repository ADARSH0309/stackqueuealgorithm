package tests;

import src.LinkedListStack;

public class TestLinkedListStack {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack.peek()); // Expected Output: 1
    }
}
