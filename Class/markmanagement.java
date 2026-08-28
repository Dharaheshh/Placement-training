package Class;
import java.util.*;

public class markmanagement {
    public static void main(String[] args) {

        Map<Integer, Integer> marks = new HashMap<>();

        marks.put(101, 85);
        marks.put(102, 72);
        marks.put(103, 91);
        marks.put(104, 68);

        System.out.println("Marks of 101: " + marks.get(101));

        marks.put(102, 80);

        int highest = -1;
        int topStudent = -1;

        for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
            if (entry.getValue() > highest) {
                highest = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Highest: " + topStudent + " -> " + highest);

        System.out.println("Students scoring > 75:");

        for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
            if (entry.getValue() > 75)
                System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int sum = 0;

        for (int m : marks.values())
            sum += m;

        double average = (double) sum / marks.size();

        System.out.println("Average: " + average);

        System.out.println("Student 103 exists: " + marks.containsKey(103));
    }
}