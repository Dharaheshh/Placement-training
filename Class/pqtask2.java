package Class;
import java.util.*;

class Patient {
    String name;
    int severity;
    int arrival;
    int age;
    Patient(String name, int severity, int arrival, int age) {
        this.name = name;
        this.severity = severity;
        this.arrival = arrival;
        this.age = age;
    }
}
class PatientComparator implements Comparator<Patient> {
    public int compare(Patient a, Patient b) {
        if (a.severity != b.severity)
            return b.severity - a.severity;
        if (a.arrival != b.arrival)
            return a.arrival - b.arrival;
        boolean x = a.age < 12 || a.age > 65;
        boolean y = b.age < 12 || b.age > 65;
        if (x != y)
            return x ? -1 : 1;
        return a.name.compareTo(b.name);
    }
}

public class pqtask2 {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq =
            new PriorityQueue<>(new PatientComparator());

        pq.add(new Patient("AAAA", 3, 10, 8));
        pq.add(new Patient("BBBB", 3, 5, 40));
        pq.add(new Patient("CCCC", 5, 20, 30));

        System.out.println(pq.poll().name); // CCCC
        System.out.println(pq.poll().name); // BBBB
        System.out.println(pq.poll().name); // AAAA
    }
}