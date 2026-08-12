class BankAccount {
    int accountNumber;
    String customerName;
    String accountType;
    double balance;

    BankAccount(int accountNumber, String customerName,
                String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited into Account " + accountNumber);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Account " + accountNumber);
        }
    }

    void transfer(BankAccount receiver, double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            receiver.balance += amount;

            System.out.println("₹" + amount + " transferred from Account "
                    + this.accountNumber + " to Account " + receiver.accountNumber);
        } else {
            System.out.println("Transfer failed: Insufficient balance");
        }
    }

    void display() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Dharaheshh", "Savings", 0);
        BankAccount acc2 = new BankAccount(102, "Arun", "Savings", 0);
        BankAccount acc3 = new BankAccount(103, "Rahul", "Current", 0);

        // Transactions
        acc1.deposit(10000);
        acc2.deposit(5000);

        acc1.transfer(acc2, 3000);

        acc2.withdraw(2000);

        // Final balances
        System.out.println("\n--- FINAL ACCOUNT DETAILS ---");

        acc1.display();
        acc2.display();
        acc3.display();
    }
}