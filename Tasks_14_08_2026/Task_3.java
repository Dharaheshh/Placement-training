package Tasks_14_08_2026;

public class Task_3 {
    public static void main(String[] args) {
        CustomerAccount1 c1 = new CustomerAccount1(1001, "Arun", "9876543210", "Savings", 25000);
        CustomerAccount1 c2 = new CustomerAccount1(1002, "Kumar", "9876501234", "Current", 50000);
        System.out.println("Customer 1:");
        System.out.println("Account Number: " + c1.getAccountNumber());
        System.out.println("Account Holder: " + c1.getAccountHolderName());
        System.out.println("Mobile Number: " + c1.getMobileNumber());
        System.out.println("Account Type: " + c1.getAccountType());
        System.out.println("Balance: Rs." + c1.getBalance());
        System.out.println("\nCustomer 2:");
        System.out.println("Account Number: " + c2.getAccountNumber());
        System.out.println("Account Holder: " + c2.getAccountHolderName());
        System.out.println("Mobile Number: " + c2.getMobileNumber());
        System.out.println("Account Type: " + c2.getAccountType());
        System.out.println("Balance: Rs." + c2.getBalance());
    }
}
class CustomerAccount1 {
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public CustomerAccount1(int accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public double getBalance() {
        return balance;
    }
}