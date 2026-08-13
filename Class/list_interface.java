package Class;

public class arraylist {
    //basic list interface program
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Dharaheshh");
        list.add("Arun");
        list.add("Kumar");
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
        list.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + list);
    }
}
