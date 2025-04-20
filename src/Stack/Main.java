package Stack;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        System.out.println(myStack.getTop().value);
        System.out.println(myStack.getHeight());

        myStack.printStack();
    }

}
