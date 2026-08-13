package Class;

public class markexception {
    public static void main(String[] args) {
        student s1 = new student("Dharaheshh", 85);
        student s2 = new student("Arun", 105);
        try {
            s1.checkMarks();
            s2.checkMarks();
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
class student {
    String name;
    int marks;
    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    void checkMarks() throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks: " + marks);
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }
}
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}