package Class;
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void displayName() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    
    Student(String name) {
        super(name);
    }
    void study() {
        System.out.println(name + " is studying");
    }
}
class Visitor extends Person {
    Visitor(String name) {
        super(name);
    }
    void visit() {
        System.out.println(name + " is visiting the place");
    }
}
class inheritance {
    public static void main(String[] args) {
        Student s = new Student("Dharaheshh");
        s.displayName();
        s.study();
        Visitor v = new Visitor("Arun");
        v.displayName();
        v.visit();
    }
}