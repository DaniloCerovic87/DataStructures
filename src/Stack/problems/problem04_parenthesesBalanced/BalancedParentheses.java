package Stack.problems.problem04_parenthesesBalanced;

import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {
        System.out.println(isBalancedParentheses("((()))"));
        System.out.println(isBalancedParentheses("(()())"));
        System.out.println(isBalancedParentheses("((()())"));
    }

    private static boolean isBalancedParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (char c : parentheses.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
