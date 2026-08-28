package Class;
import java.util.*;

public class shopping_cart_price_calculator {
    public static void main(String[] args) {

        Map<String, Double> cart = new HashMap<>();

        cart.put("Laptop", 55000.0);
        cart.put("Mouse", 800.0);
        cart.put("Keyboard", 1500.0);
        cart.put("Headphone", 2500.0);

        cart.remove("Headphone");

        
        System.out.println("Mouse price: " + cart.get("Mouse"));

        cart.put("Mouse", 900.0);

        System.out.println("\nShopping Cart");

        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        double total = 0;

        for (double price : cart.values())
            total += price;

        System.out.println("Total = " + total);

        double max = -1;
        String expensive = "";

        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                expensive = entry.getKey();
            }
        }

        System.out.println("Most Expensive = " + expensive);
    }
}