abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    abstract void withdraw(double amount);

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
}


class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    void withdraw(double amount) {

        if (getBalance() - amount >= 1000) {
            setBalance(getBalance() - amount);
            System.out.println("Savings withdrawal successful");
        } else {
            System.out.println("Minimum balance of 1000 must be maintained");
        }
    }
}


class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    void withdraw(double amount) {

        if (getBalance() - amount >= -5000) {
            setBalance(getBalance() - amount);
            System.out.println("Current withdrawal successful");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}


class Main {
    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount(101, "Dharaheshh", 5000);
        BankAccount a2 = new CurrentAccount(102, "Arun", 2000);

        a1.deposit(1000);
        a1.withdraw(4500);
        a1.displayDetails();

        System.out.println();

        a2.deposit(1000);
        a2.withdraw(7000);
        a2.displayDetails();
    }
}