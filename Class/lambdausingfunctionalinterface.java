package Class;
interface Shape {
    double area(double x, double y);
}

interface Circle {
    double area(double radius);
}

public class lambdausingfunctionalinterface {

    public static void main(String[] args) {

        Shape square = (side1, side2) -> side1 * side2;

        Shape rectangle = (length, width) -> length * width;

        Shape triangle = (base, height) -> 0.5 * base * height;

        Circle circle = radius -> Math.PI * radius * radius;

        System.out.println("Square: " + square.area(5, 5));
        System.out.println("Rectangle: " + rectangle.area(10, 5));
        System.out.println("Triangle: " + triangle.area(10, 5));
        System.out.println("Circle: " + circle.area(5));
    }
}

