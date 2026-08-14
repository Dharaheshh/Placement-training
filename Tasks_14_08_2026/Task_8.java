package Tasks_14_08_2026;
class Task_8 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);
        b.deposit(5000);
        System.out.println("New Balance: Rs." + b.getBalance());
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

