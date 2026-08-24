package Class;
import java.util.*;
public class reverse_stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String el = sc.nextLine();
            stack.push(el);
        }
        // for(int j=0;j<n;j++){
        //     System.out.print(new StringBuilder(stack.pop()).reverse().toString()+" ");
        // }
        for(int j=0;j<n;j++){
            String word = stack.pop();
            Stack<Character> charStack = new Stack<>();
            for (char c : word.toCharArray()) {
                charStack.push(c);
            }
            for(int k=0;k<word.length();k++){
                System.out.print(charStack.pop());
            }
            System.out.print(" ");
        }
    }
}
