package Stack.problems.problem06_sortStack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        sortStack(stack);

        stack.printStack();
    }

    private static void sortStack(Stack<Integer> stack) {
        Stack<Integer> additionalStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                stack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }

        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
    }

}
