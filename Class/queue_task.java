package Class;
import java.util.*;
public class queue_task {
    static class printer{
        String name;
        String task;
        printer(String name,String task){
            this.name = name;
            this.task = task;
        }
        
        void display(){
            System.out.println(name);
            System.out.println(task);
        }
    }
    public static void main(String[] args) {
        Queue<printer> queue = new LinkedList<>();
        printer p1 = new printer("Dharaheshh","Task1");
        printer p2 = new printer("John","Task22");
        printer p3 = new printer("Doe","Task3");
        printer p4 = new printer("Jane","Task4");
        printer p5 = new printer("Smith","Task5");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Printers Available: ");
            p1.display();
            p2.display();
            p3.display();
            p4.display();
            p5.display();
            System.out.println("Enter the printer number you want to add to the queue (1-5):");
            int choice = sc.nextInt();
            sc.nextLine();
            printer p;
            switch(choice) {
                case 1:
                    p = p1;
                    break;
                case 2:
                    p = p2;
                    break;
                case 3:
                    p = p3;
                    break;
                case 4:
                    p = p4;
                    break;
                case 5:
                    p = p5;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    i--; // Decrement to re-prompt for the same iteration
                    continue;
            }
            if(!queue.contains(p)){
                queue.add(p);
            }
            else{
                System.out.println("Printer already exists in the queue.");
            }
        }
    }
}
