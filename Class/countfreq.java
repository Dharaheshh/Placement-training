package Class;
import java.util.*;
public class countfreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character frequencies:");
        for(Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
