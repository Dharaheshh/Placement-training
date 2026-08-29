package Class;
class OrderProcessing extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Order " + i + " is being processed");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Kitchen extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Kitchen is preparing Order " + i);

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Delivery extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Order " + i + " is out for delivery");

            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class multithreadtask {

    public static void main(String[] args) {

        OrderProcessing order = new OrderProcessing();
        Kitchen kitchen = new Kitchen();
        Delivery delivery = new Delivery();

        order.start();
        kitchen.start();
        delivery.start();
    }
}

