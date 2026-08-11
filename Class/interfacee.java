package Class;
interface Vehicle {
    int MAX_SPEED = 120;
    void start();
    void stop();
    default void displayType() {
        System.out.println("This is a vehicle");
    }
    static void company() {
        System.out.println("Vehicle Company");
    }
}
interface Electric {
    void charge();
}
class Car implements Vehicle, Electric {

    public void start() {
        System.out.println("Car starts");
    }

    public void stop() {
        System.out.println("Car stops");
    }

    public void charge() {
        System.out.println("Car charging");
    }
}

class interfacee {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.charge();
        c.stop();
    }
}