package Class;

abstract class employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract double bonusCalculation();
    abstract void display();
}
class developer extends employee {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    double bonusCalculation() {
        return getSalary() * 0.10; // 10% bonus for developers
    }

    @Override
    void display() {
        System.out.println("Developer Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Specialization: " + specialization);
        System.out.println("Bonus: " + bonusCalculation());
    }
}
class manager extends employee {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    double bonusCalculation() {
        return getSalary() * 0.15; // 15% bonus for managers
    }

    @Override
    void display() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonusCalculation());
    }
}
class officeWorker extends employee {
    private String shift;

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    double bonusCalculation() {
        return getSalary() * 0.05; // 5% bonus for office workers
    }

    @Override
    void display() {
        System.out.println("Office Worker Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Shift: " + shift);
        System.out.println("Bonus: " + bonusCalculation());
    }
}
public class setter_getter {
    public static void main(String[] args) {
        developer dev = new developer();
        dev.setName("Alice");
        dev.setSalary(60000);
        dev.setSpecialization("Full Stack");
        dev.display();

        System.out.println();

        manager mgr = new manager();
        mgr.setName("Bob");
        mgr.setSalary(80000);
        mgr.setDepartment("IT");
        mgr.display();

        System.out.println();

        officeWorker worker = new officeWorker();
        worker.setName("Charlie");
        worker.setSalary(40000);
        worker.setShift("Morning");
        worker.display();
    }
}
//employee (abstract class) --> parent class
//name private salary private
//getname setname getsalary set salary
//bonus calculation (abstract method)
//display (abstract method)

//developer child
//full stack,mern stack
//@override bonus calc

//manager -child
//@override bonus_calc

//office worker -child