package Class;

class task_exception {
    public static void main(String[] args) {
        bank b = new bank();
        try {
            b.withdraw(500);
            b.withdraw(600);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class bank {
    int balance = 1000;
    void withdraw(int amount) throws Exception {
        if (balance < amount) {
            throw new Exception("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }
}