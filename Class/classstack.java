package Class;
import java.util.*;
class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class classstack {
    public static void main(String[] args){
        Stack<Employee> stack = new Stack<>();
        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Alice");
        Employee emp3 = new Employee(3, "Bob");
        stack.push(emp1);
        stack.push(emp2);
        stack.push(emp3);
        while (!stack.isEmpty()) {
            Employee emp = stack.pop();
            System.out.println("ID: " + emp.id + ", Name: " + emp.name);
        }
    }
}
