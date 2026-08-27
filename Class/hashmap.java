package Class;
import java.util.*;
class menu{
    static HashMap<String, Integer> menu_items = new HashMap<>();
    String item_name;
    int item_price;
    void add(String item_name, int item_price){
        menu_items.put(item_name, item_price);
    }
    void display(){
        for(String s: menu_items.keySet()){
            System.out.println(s + " : " + menu_items.get(s));
        }
    }

}
public class hashmap {
    public static void main(String[] args) {
        menu m = new menu();
        m.add("Burger", 50);
        m.add("Pizza", 100);
        m.add("Pasta", 80);
        m.display();
    }
}
