package Class;

public class overloading {
    //example of method overloading with area of shapes
    void area() {
        System.out.println("Area of shape is not defined");
    }
    void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }
    void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
    void area(double radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
    void area(double base, double height) {
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }

}
class overloadingMain {
    public static void main(String[] args) {
        overloading o = new overloading();
        o.area();
        o.area(5);
        o.area(4, 6);
        o.area(3.5);
        o.area(4.0, 5.0);
    }
}
