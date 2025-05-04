package HashTable.problemsSet.problem02_hasUniqueChars;

import java.util.HashSet;
import java.util.Set;

public class HasUniqueChars {

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg"));
        System.out.println(hasUniqueChars("hello"));
        System.out.println(hasUniqueChars(""));
        System.out.println(hasUniqueChars("0123456789"));
        System.out.println(hasUniqueChars("abacade"));
    }

    private static boolean hasUniqueChars(String string) {
        Set<Character> charSet = new HashSet<>();
        for(char c : string.toCharArray()) {
            if(charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

}
