abstract class Employee {

    private int id;
    private String name;
    private double basicSalary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.basicSalary = 0;
    }

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getBasicSalary() {
        return basicSalary;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBasicSalary(double salary) {
        this.basicSalary = salary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}


class Doctor extends Employee {

    private double consultationAllowance;

    Doctor(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        consultationAllowance = allowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + consultationAllowance;
    }
}


class Nurse extends Employee {

    private double nightAllowance;

    Nurse(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        nightAllowance = allowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + nightAllowance;
    }
}


class LabTechnician extends Employee {

    private double labAllowance;

    LabTechnician(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        labAllowance = allowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + labAllowance;
    }
}


class Main {

    public static void main(String[] args) {

        Employee[] employees = {
            new Doctor(101, "Dharaheshh", 50000, 10000),
            new Nurse(102, "Arun", 30000, 5000),
            new LabTechnician(103, "Rahul", 35000, 7000)
        };

        Employee highest = employees[0];

        for (Employee e : employees) {

            e.displayDetails();
            System.out.println();

            if (e.calculateSalary() > highest.calculateSalary()) {
                highest = e;
            }
        }

        System.out.println("Highest Paid Employee:");
        System.out.println(highest.getName());
        System.out.println(highest.calculateSalary());
    }
}