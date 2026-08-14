package Tasks_14_08_2026;

public class Task_1 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Dharaheshh", 123456);
        Customer c2 = new Customer("Arun", 654321);
        System.out.println("Customer 1: " + c1.name + ", Account Number: " + c1.accountNumber + ", Bank Name: " + Customer.bankName);
        System.out.println("Customer 2: " + c2.name + ", Account Number: " + c2.accountNumber + ", Bank Name: " + Customer.bankName);
}}
class Customer {
    String name;
    int accountNumber;
    static String bankName = "mariaman indian bank";
    Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
}
