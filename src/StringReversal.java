package src;

import java.util.Stack;

public class StringReversal {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) {
            s.push(c);
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!s.isEmpty()) {
            reversedStr.append(s.pop());
        }

        return reversedStr.toString();
    }
}
