package Stack.problems.problem01_pushForStackThatUsesArrayList;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printStack();
        System.out.println("Peek: " + stack.peek());
    }
}
