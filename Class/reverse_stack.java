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
        for(int j=0;j<n;j++){
            System.out.print(stack.pop()+" ");
        }
    }
}
