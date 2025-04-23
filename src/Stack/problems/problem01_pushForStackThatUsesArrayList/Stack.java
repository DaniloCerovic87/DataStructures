package Stack.problems.problem01_pushForStackThatUsesArrayList;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private final List<T> stackList = new ArrayList<>();

    public List<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = size() - 1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T value) {
        stackList.add(value);
    }

}
