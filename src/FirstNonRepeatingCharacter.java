import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static Character findFirstUnique(String text) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char ch : text.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(findFirstUnique("swiss")); // w
        System.out.println(findFirstUnique("aabb"));  // null
    }
}
