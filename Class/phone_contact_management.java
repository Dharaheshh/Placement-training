package Class;
import java.util.*;

public class phone_contact_management {
    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();

        contacts.put("Arun", "9876543210");
        contacts.put("Kumar", "9123456780");
        contacts.put("Priya", "9988776655");
        contacts.put("Divya", "9000011111");

        String name = "Kumar";

        if (contacts.containsKey(name))
            System.out.println(name + " -> " + contacts.get(name));
        else
            System.out.println("Contact not found");

        contacts.put("Kumar", "9999999999");

        contacts.remove("Divya");

        System.out.println("\nAll Contacts:");

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(
            "Priya exists: " + contacts.containsKey("Priya")
        );

        System.out.println(
            "Phone exists: " + contacts.containsValue("9988776655")
        );
    }
}