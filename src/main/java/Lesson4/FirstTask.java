package Lesson4;

import java.util.Stack;

public class FirstTask {

    public static void main(String[] args) {
        boolean res = isValid();
        System.out.println(res);
    }

    public static boolean isValid() {
        Stack<Character> stack = new Stack<>();

        String s = "(){}";
        for (char c: s.toCharArray()){
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
