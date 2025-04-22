package Stack.problems.problem05_bracketsBalanced;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(isBalancedBrackets("((({}[])))"));
        System.out.println(isBalancedBrackets("((({[]})))"));
        System.out.println(isBalancedBrackets("((({]})))"));
    }

    private static boolean isBalancedBrackets(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char bracket = stack.pop();
                if (c == ')' && bracket != '('
                        || c == ']' && bracket != '['
                        || c == '}' && bracket != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
