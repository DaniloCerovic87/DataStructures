package Stack.problems.problem07_nextGreaterElement;

import java.util.Arrays;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3};
        System.out.println(Arrays.toString(nextGreaterElementFromTheRight(arr1)));

        int[] arr2 = {1, 1, 1, 2, 3, 5, 6};
        System.out.println(Arrays.toString(nextGreaterElementFromTheRight(arr2)));
    }

    private static int[] nextGreaterElementFromTheRight(int[] array) {
        int[] result = new int[array.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = array.length - 1; i >= 0; i--) {
            int current = array[i];
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(current);
        }
        return result;
    }

}
