package Class;
import java.util.*;
public class usualtask {
    //create 5 diff constructors for 5 diff colors 
    //store their reference id in linkedlist (use collections)
    public static void main(String[] args) {
        LinkedList<colors> colorList = new LinkedList<>();
        colors c1 = new colors(1,"Red");
        colors c2 = new colors(2,"Green");
        colors c3 = new colors(3,"Blue");
        colors c4 = new colors(4,"Yellow");
        colors c5 = new colors(5,"Purple");
        colorList.add(c1);
        colorList.add(c2);
        colorList.add(c3);
        colorList.add(c4);
        colorList.add(c5);}
}
class colors{
    int id;
    String name;
    void method1(){
        System.out.println("Color ID: " + id);
        System.out.println("Color Name: " + name);
    }
    colors(int id, String name){
        this.id = id;
        this.name = name;
    }
}
