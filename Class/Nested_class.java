package Class;
public class Nested_class {
    class subject {
        void display() {
            System.out.println("Chemistry, Physics, Maths, Biology, Computer Science");
        }
        class chemistry {
            int subject_code;
            chemistry(int subject_code) {
                this.subject_code = subject_code;
            }
            void display() {
                System.out.println("Chemistry code: " + subject_code);
            }
        }
        class physics {
            int subject_code;
            physics(int subject_code) {
                this.subject_code = subject_code;
            }
            void display() {
                System.out.println("Physics code: " + subject_code);
            }
        }
        class maths {
            int subject_code;
            maths(int subject_code) {
                this.subject_code = subject_code;
            }
            void display() {
                System.out.println("Maths code: " + subject_code);
            }
        }
        class biology {
            int subject_code;
            biology(int subject_code) {
                this.subject_code = subject_code;
            }
            void display() {
                System.out.println("Biology code: " + subject_code);
            }
        }
        class computer_science {
            int subject_code;
            computer_science(int subject_code) {
                this.subject_code = subject_code;
            }
            void display() {
                System.out.println("Computer Science code: " + subject_code);
            }
        }
    }
    public static void main(String[] args) {
        Nested_class obj = new Nested_class();
        subject s = obj.new subject();
        s.display();
        subject.chemistry c = s.new chemistry(101);
        c.display();
        subject.physics p = s.new physics(102);
        p.display();
        subject.maths m = s.new maths(103);
        m.display();
        subject.biology b = s.new biology(104);
        b.display();
        subject.computer_science cs = s.new computer_science(105);
        cs.display();
    }
}