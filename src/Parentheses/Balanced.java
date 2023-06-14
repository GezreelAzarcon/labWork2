package Parentheses;

import java.util.Stack;

public class Balanced {
    public static void main(String[] args) {

        String example = "{()}";
        //String example = "[{()}"

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < example.length(); i++) {
            if(example.charAt(i) == '{' || example.charAt(i) == '[' || example.charAt(i) == '(') {
                stack.push(example.charAt(i));

            }else if ( !stack.empty() && (
                    (example.charAt(i) == '}' && stack.peek() == '{') ||
                    (example.charAt(i) == ']' && stack.peek() == '[') ||
                    (example.charAt(i) == ')' && stack.peek() == '('))) {
                stack.pop();

            }else {
                stack.push(example.charAt(i));
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}