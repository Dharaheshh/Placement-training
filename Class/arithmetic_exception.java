package Class;
class arithmetic_exception {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int div = a / b;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("0 division error");
        }
    }
}