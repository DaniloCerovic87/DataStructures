package Stack;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        System.out.println("Top: " + myStack.getTop().value);
        System.out.println("Height: " + myStack.getHeight());
        myStack.printStack();

        myStack.push(5);
        myStack.push(6);

        System.out.println("Top: " + myStack.getTop().value);
        System.out.println("Height: " +myStack.getHeight());
        myStack.printStack();

        System.out.println("Removed node: " + myStack.pop().value);
        System.out.println("Removed node: " + myStack.pop().value);
        System.out.println("Removed node: " + myStack.pop().value);
        myStack.printStack();
    }

}
