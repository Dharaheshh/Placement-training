package Class;
abstract class Vehicle {
    String name;
    Vehicle(String name) {
        this.name = name;
    }
    abstract void start();
    void display() {
        System.out.println("Vehicle: " + name);
    }
}
class Car extends Vehicle {
    Car(String name) {
        super(name);
    }
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}
class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
    @Override
    void start() {
        System.out.println("Bike starts with a self-start");
    }
}
class abstractt {
    public static void main(String[] args) {
        Car c = new Car("BMW");
        c.display();
        c.start();
        Bike b = new Bike("Yamaha");
        b.display();
        b.start();
    }
}