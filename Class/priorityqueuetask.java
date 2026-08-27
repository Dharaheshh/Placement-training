package Class;
import java.util.*;
class panel{
    int panel_no,number_of_candidates;
    String panel_name;
    panel(int panel_no, String panel_name, int number_of_candidates){
        this.panel_no = panel_no;
        this.panel_name = panel_name;
        this.number_of_candidates = number_of_candidates;
    }
}
public class priorityqueuetask {
    public static void main(String[] args) {
        PriorityQueue<panel> q = new PriorityQueue<>((a,b) -> a.panel_no - b.panel_no);
        q.add(new panel(1, "Panel 1", 10));
        q.add(new panel(3, "Panel 2", 5));
        q.add(new panel(2, "Panel 3", 15));
        System.out.println("Priority Queue: ");
        while(!q.isEmpty()){
            panel p = q.poll();
            System.out.println("Panel No: " + p.panel_no + ", Panel Name: " + p.panel_name + ", Number of Candidates: " + p.number_of_candidates);
        }
    }
}
