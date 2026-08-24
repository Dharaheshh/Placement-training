package Class;
import java.util.*;
public class monotonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                dec = false;
            } else if (arr[i] < arr[i - 1]) {
                inc = false;
            }
        }
        if (inc || dec) {
            System.out.println("The array is monotonic.");
        } else {
            System.out.println("The array is not monotonic.");
        }
    }
}
