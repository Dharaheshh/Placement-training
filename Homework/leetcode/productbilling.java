package leetcode;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotal() {
        return price * quantity;
    }

    double applyDiscount(double discountPercent) {
        return calculateTotal() * discountPercent / 100;
    }

    void display() {
        System.out.println(productId + "  " + productName +
                "  ₹" + price + "  " + quantity +
                "  ₹" + calculateTotal());
    }
}

public class productbilling {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mouse", 1000, 3);
        Product p3 = new Product(103, "Keyboard", 2000, 2);
        Product p4 = new Product(104, "Monitor", 15000, 1);
        Product p5 = new Product(105, "Headphones", 3000, 4);
        double subtotal = p1.calculateTotal()+ p2.calculateTotal()+ p3.calculateTotal()+ p4.calculateTotal()+ p5.calculateTotal();
        double discount = subtotal * 10 / 100;

        double gst = (subtotal - discount) * 18 / 100;

        double finalAmount = subtotal - discount + gst;

        System.out.println("------------- BILL -------------");
        System.out.println("ID    Product       Price   Qty   Total");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        System.out.println("Subtotal       : ₹" + subtotal);
        System.out.println("Discount (10%) : ₹" + discount);
        System.out.println("GST (18%)      : ₹" + gst);
        System.out.println("Final Amount   : ₹" + finalAmount);
        Product expensive = p1;
        if (p2.price > expensive.price) expensive = p2;
        if (p3.price > expensive.price) expensive = p3;
        if (p4.price > expensive.price) expensive = p4;
        if (p5.price > expensive.price) expensive = p5;
        Product cheapest = p1;
        if (p2.price < cheapest.price) cheapest = p2;
        if (p3.price < cheapest.price) cheapest = p3;
        if (p4.price < cheapest.price) cheapest = p4;
        if (p5.price < cheapest.price) cheapest = p5;
        Product highestQuantity = p1;
        if (p2.quantity > highestQuantity.quantity) highestQuantity = p2;
        if (p3.quantity > highestQuantity.quantity) highestQuantity = p3;
        if (p4.quantity > highestQuantity.quantity) highestQuantity = p4;
        if (p5.quantity > highestQuantity.quantity) highestQuantity = p5;
        int totalItems = p1.quantity + p2.quantity + p3.quantity + p4.quantity + p5.quantity;
        System.out.println("Most Expensive : " + expensive.productName);
        System.out.println("Cheapest       : " + cheapest.productName);
        System.out.println("Highest Qty    : " + highestQuantity.productName);
        System.out.println("Total Items    : " + totalItems);
    }
}
