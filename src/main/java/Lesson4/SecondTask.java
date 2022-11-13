package Lesson4;

import java.util.Stack;

public class SecondTask {

    public static void main(String[] args) {
        String[] tok={"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tok));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<tokens.length; i++){
            switch(tokens[i]){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    int a=stack.pop(), b = stack.pop();
                    stack.push(b/a);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
