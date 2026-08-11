package Class;
abstract class Car {
    void company() {
        System.out.println("Car Company");
    }
    abstract void start();
}
class Tata extends Car {
    @Override
    void start() {
        System.out.println("Tata Car Started");
    }
}
class TataNano extends Tata {
    @Override
    void start() {
        System.out.println("Tata Nano Started");
    }
}
class Diesel extends TataNano {
    @Override
    void start() {
        System.out.println("Tata Nano Diesel Started");
    }
}
class Petrol extends TataNano {
    @Override
    void start() {
        System.out.println("Tata Nano Petrol Started");
    }
}
class EV extends TataNano {
    @Override
    void start() {
        System.out.println("Tata Nano EV Started");
    }
}
class Owner extends EV {
    void ownerName(String name) {
        System.out.println("Owner: " + name);
    }
}
class practice1 {
    public static void main(String[] args) {
        Diesel d = new Diesel();
        d.company();
        d.start();
        System.out.println();
        Petrol p = new Petrol();
        p.company();
        p.start();
        System.out.println();
        Owner o = new Owner();
        o.company();
        o.start();
        o.ownerName("Dharaheshh");
    }
}