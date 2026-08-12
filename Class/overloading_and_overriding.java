package Class;
class overloading_and_overriding {
    // bankaccount -> Class
    // deposit(amt) -> m
    //deposit(amt, description) -> m
    //deposite(amt, description, id_no) -> m

    //savings -> c_class1
    //interest_calc(6%) -> m

    //current -> c_class2
    //interest_calc(2%) -> m
    public static void main(String[] args) {
        bankaccount b = new bankaccount();
        savings s = new savings();
        current c = new current();
        b.deposit(1000.0);
        b.deposit(1000.0,"health");
        b.deposit(500000.0,"education",101);
        s.interest_calc(6.0);
        c.interest_calc(2.0);

    }
}
class bankaccount {
    double balance;
    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
        System.out.println("Total balance: " + balance);
    }
    void deposit(double amt, String description) {
        balance += amt;
        System.out.println("Deposited: " + amt + " for " + description);
        System.out.println("Total balance: " + balance);
    }
    void deposit(double amt, String description, int id_no) {
        balance += amt;
        System.out.println("Deposited: " + amt + " for " + description + " with ID: " + id_no);
        System.out.println("Total balance: " + balance);
    }
}
class savings extends bankaccount {
    void interest_calc(double rate) {
        double interest = balance * rate / 100.0;
        System.out.println("Interest calculated at " + rate + "% for savings account");
        System.out.println("Interest amount: " + interest);
    }
}
class current extends bankaccount {
    void interest_calc(double rate) {
        double interest = balance * rate / 100.0;
        System.out.println("Interest calculated at " + rate + "% for current account");
        System.out.println("Interest amount: " + interest);
    }
}