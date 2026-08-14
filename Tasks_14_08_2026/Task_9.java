package Tasks_14_08_2026;

public class Task_9 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial Balance: Rs." + account.getBalance());

        account.deposit(500.0);
        System.out.println("After Deposit: Rs." + account.getBalance());

        account.withdraw(200.0);
        System.out.println("After Withdrawal: Rs." + account.getBalance());

        account.withdraw(1500.0);
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    // create deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance = Rs." + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}