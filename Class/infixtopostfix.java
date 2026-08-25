package Class;
import java.util.*;

public class infixtopostfix {
    // infix to postfix conversion using stack
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        String postfix = infixToPostfix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' &&
                        ((c != '^' && stack.peek() == '^') ||
                         ((c == '*' || c == '/') &&
                          (stack.peek() == '*' || stack.peek() == '/')) ||
                         ((c == '+' || c == '-') &&
                          (stack.peek() == '+' || stack.peek() == '-' ||
                           stack.peek() == '*' || stack.peek() == '/' ||
                           stack.peek() == '^')))) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
}
