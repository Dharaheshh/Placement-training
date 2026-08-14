package Tasks_14_08_2026;

public class Task_10 {
    public static void main(String[] args) {
        BankAccount10 account1 = new BankAccount10(1001, "Arun", "9876543210", "Savings", 25000);
        BankAccount10 account2 = new BankAccount10(1002, "Kumar", "9876501234", "Current", 50000);
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account1.deposit(5000);
        account2.withdraw(10000);
        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}
class BankAccount10 {
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public BankAccount10(int accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    // create deposit and withdraw methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
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
    public void displayAccountDetails() {
        System.out.println("MARIAMMAN INDIAN BANK");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}