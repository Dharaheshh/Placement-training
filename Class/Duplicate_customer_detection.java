package Class;
import java.util.*;

public class Duplicate_customer_detection {
    public static void main(String[] args) {

        String[] registered = {"C101", "C102", "C103", "C101", "C104", "C105", "C103", "C106"};
        String[] purchases = {"C101", "C103", "C107", "C108"};
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String id : registered) {
            if (!seen.add(id)) {
                duplicates.add(id);
            }
        }
        Set<String> result = new HashSet<>();

        for (String id : purchases) {
            if (duplicates.contains(id)) {
                result.add(id);
            }
        }

        System.out.println(result);
    }
}