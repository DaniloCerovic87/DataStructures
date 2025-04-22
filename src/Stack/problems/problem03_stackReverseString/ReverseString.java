package Stack.problems.problem03_stackReverseString;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reverseString(""));
        System.out.println(reverseString("danilo"));
    }

    public static String reverseString(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }

        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

}
