package tests;

import src.ArrayStack;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack.peek()); // Expected Output: 1
    }
}
