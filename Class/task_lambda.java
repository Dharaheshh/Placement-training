package Class;
import java.util.Arrays;
class product{
    String type;
    double price;
    product(String type, double price){
        this.type = type;
        this.price = price;
    }
}
public class task_lambda {
    public static void main(String[] args) {
        product p1 = new product("Electronics", 1500.0);
        product p2 = new product("Clothing", 800.0);
        product p3 = new product("Groceries", 300.0);
        product p4 = new product("Furniture", 2500.0);
        product p5 = new product("Books", 400.0);
        product[] products = {p1, p2, p3, p4, p5};
        Arrays.sort(products, (a, b) -> Double.compare(a.price, b.price));
    }
}
