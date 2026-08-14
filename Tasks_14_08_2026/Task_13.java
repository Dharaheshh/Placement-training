package Tasks_14_08_2026;

public class Task_13 {
    public static void main(String[] args) {
        BankAccount13 account1 = new BankAccount13(1001, "Arun", "9876543210", "Savings", 25000);
        BankAccount13 account2 = new BankAccount13(1002, "Kumar", "9876501234", "Current", 50000);

        System.out.println("Account 1:");
        account1.displayAccountDetails();

        account1.deposit(5000);
        System.out.println("\nAfter Deposit of Rs.5000:");
        System.out.println("Updated Balance: Rs." + account1.getBalance());

        account1.withdraw(3000);
        System.out.println("\nAfter Withdrawal of Rs.3000:");
        System.out.println("Updated Balance: Rs." + account1.getBalance());

        account1.setMobileNumber("9999999999");
        System.out.println("\nUpdated Mobile Number for Account 1: " + account1.getMobileNumber());

        account1.deposit(-1000); 
        account1.withdraw(-500); 
        account1.withdraw(100000); 

        System.out.println("\nAccount 2:");
        account2.displayAccountDetails();

        account2.deposit(10000);
        System.out.println("\nAfter Deposit of Rs.10000:");
        System.out.println("Updated Balance: Rs." + account2.getBalance());

        account2.withdraw(5000);
        System.out.println("\nAfter Withdrawal of Rs.5000:");
        System.out.println("Updated Balance: Rs." + account2.getBalance());

        System.out.println("\nFinal Account Details for Account 2:");
        account2.displayAccountDetails();


    }
}
class BankAccount13 {
    private static final String bankName = "MARIAMMAN INDIAN BANK";
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public BankAccount13(int accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
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

    public static String getBankName() {
        return bankName;
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
        System.out.println(getBankName());
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}

