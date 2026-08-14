package Class;
import java.util.*;

public class arraylist_seperate_mul10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,20,21,30,31,41,40,-1));
        System.out.println("Original List: " + list);
        separateMultiplesOf10(list);
        System.out.println("Modified List: " + list);
    }
    public static void separateMultiplesOf10(ArrayList<Integer> list) {
        int n = list.size();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) % 10 != 0) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                j++;
            }
        }
    }
};
