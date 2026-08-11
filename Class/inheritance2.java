package Class;

class Management {
    void display() {
        System.out.println("Management System");
    }
}

class School extends Management {
    void school() {
        System.out.println("School Management");
    }
}

class Teacher extends School {
    void teacher() {
        System.out.println("Teacher manages students");
    }
}

class Worker extends School {
    void worker() {
        System.out.println("Worker manages school work");
    }
}

class College extends Management {
    void college() {
        System.out.println("College Management");
    }
}

class Professor extends College {
    void professor() {
        System.out.println("Professor teaches students");
    }
}

class Transport extends College {
    void transport() {
        System.out.println("Transport manages college buses");
    }
}

class Placement extends Management {
    void placement() {
        System.out.println("Placement Management");
    }
}

class Staff extends Placement {
    void staff() {
        System.out.println("Placement staff manages companies");
    }
}

class Company extends Placement {
    void company() {
        System.out.println("Company provides training");
    }
}

class inheritance2 {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.display();
        t.school();
        t.teacher();

        Professor p = new Professor();
        p.display();
        p.college();
        p.professor();

        Staff s = new Staff();
        s.display();
        s.placement();
        s.staff();
    }
}
