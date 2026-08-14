package Tasks_14_08_2026;

public class Task_4 {
    public static void main(String[] args) {
        BankAccount7 account1 = new BankAccount7(1001, "Arun", "9876543210", "Savings", 25000);
        BankAccount7 account2 = new BankAccount7(1002, "Kumar", "9876501234", "Current", 50000);

        System.out.println("Account 1:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Mobile Number: " + account1.getMobileNumber());
        System.out.println("Account Type: " + account1.getAccountType());
        System.out.println("Balance: Rs." + account1.getBalance());

        System.out.println("\nAccount 2:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Account Holder: " + account2.getAccountHolderName());
        System.out.println("Mobile Number: " + account2.getMobileNumber());
        System.out.println("Account Type: " + account2.getAccountType());
        System.out.println("Balance: Rs." + account2.getBalance());
    }
}
class BankAccount7 {
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public BankAccount7(int accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance) {
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
