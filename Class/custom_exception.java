package Class;

public class custom_exception {
    public static void main(String[] args) {
        bankaccount b = new bankaccount(1000);
        custom_exception ce = new custom_exception();
        try {
            b.withdraw(500);
            b.withdraw(600);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
class bankaccount {
    private double balance;
    public bankaccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
