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
    void display_max_price(){
        int max_price = Collections.max(menu_items.values());
        for(String s: menu_items.keySet()){
            if(menu_items.get(s) == max_price){
                System.out.println("Item with maximum price: " + s + " : " + max_price);
            }
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
        m.display_max_price();
    }
}
