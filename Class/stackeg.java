package Class;
import java.util.*;
public class stackeg {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Size");
            System.out.println("6. Display");
            System.out.println("-1. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int pe = stack.pop();
                        System.out.println("Popped element: " + pe);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        int topElement = stack.peek();
                        System.out.println("Top element: " + topElement);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("Size of stack: " + stack.size());
                    break;
                case 6:
                    if (!stack.isEmpty()) {
                        System.out.println("Stack elements: " + stack);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case -1:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != -1);
        sc.close();
    }
}
