package Tasks_14_08_2026;

public class Task_7 {
    public static void main(String[] args) {
        BankAccount8 account1 = new BankAccount8(1001, "Arun", "9876543210", "Savings", 25000);
        BankAccount8 account2 = new BankAccount8(1002, "Kumar", "9876501234", "Current", 50000);

        System.out.println("Account 1:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Mobile Number: " + account1.getMobileNumber());
        System.out.println("Account Type: " + account1.getAccountType());
        System.out.println("Balance: Rs." + account1.getBalance());

        account1.setMobileNumber("9999999999");
        System.out.println("\nUpdated Mobile Number for Account 1: " + account1.getMobileNumber());

        System.out.println("\nAccount 2:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Account Holder: " + account2.getAccountHolderName());
        System.out.println("Mobile Number: " + account2.getMobileNumber());
        System.out.println("Account Type: " + account2.getAccountType());
        System.out.println("Balance: Rs." + account2.getBalance());

        account2.setMobileNumber("8888888888");
        System.out.println("\nUpdated Mobile Number for Account 2: " + account2.getMobileNumber());
        
    }
}
class BankAccount8 {
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public BankAccount8(int accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance) {
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

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }
}