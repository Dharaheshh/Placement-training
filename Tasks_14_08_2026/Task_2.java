package Tasks_14_08_2026;

public class Task_2 {
    public static void main(String[] args) {
        CustomerAccount c1 = new CustomerAccount(1001, "Arun", "9876543210", "Savings", 25000);
        CustomerAccount c2 = new CustomerAccount(1002, "Kumar", "9876501234", "Current", 50000);
        
        System.out.println("Customer 1:");
        System.out.println("Account Number: " + c1.accountNumber);
        System.out.println("Account Holder: " + c1.accountHolderName);
        System.out.println("Mobile Number: " + c1.mobileNumber);
        System.out.println("Account Type: " + c1.accountType);
        System.out.println("Balance: Rs." + c1.balance);
        
        System.out.println("\nCustomer 2:");
        System.out.println("Account Number: " + c2.accountNumber);
        System.out.println("Account Holder: " + c2.accountHolderName);
        System.out.println("Mobile Number: " + c2.mobileNumber);
        System.out.println("Account Type: " + c2.accountType);
        System.out.println("Balance: Rs." + c2.balance);
    }
}
class CustomerAccount {
    int accountNumber;
    String accountHolderName;
    String mobileNumber;
    String accountType;
    double balance;

    CustomerAccount(int accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}