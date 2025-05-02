package HashTable.problemsMap.problem03_firstNonRepeatingCharacter;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("leetcode"));
    }

    private static Character firstNonRepeatingChar(String string) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(charCounts.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

}
