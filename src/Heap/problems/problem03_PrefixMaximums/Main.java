package Heap.problems.problem03_PrefixMaximums;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Test case 1
        int[] nums1 = {1, 5, 2, 9, 3, 6, 8};
        System.out.println("Test case 1:");
        System.out.println("Input: [1, 5, 2, 9, 3, 6, 8]");
        System.out.println("Expected output: [1, 5, 5, 9, 9, 9, 9]");
        System.out.println("Actual output: " + prefixMaximumsUsingHeap(nums1));

        //Test case 2
        int[] nums2 = {10, 2, 5, 1, 0, 11, 6};
        System.out.println("Test case 2:");
        System.out.println("Input: [10, 2, 5, 1, 0, 11, 6]");
        System.out.println("Expected output: [10, 10, 10, 10, 10, 11, 11]");
        System.out.println("Actual output: " + prefixMaximumsUsingHeap(nums2));

        //Test case 3
        int[] nums3 = {3, 3, 3, 3, 3};
        System.out.println("Test case 1:");
        System.out.println("Input: [3, 3, 3, 3, 3]");
        System.out.println("Expected output: [3, 3, 3, 3, 3]");
        System.out.println("Actual output: " + prefixMaximumsUsingHeap(nums3));
    }

    private static List<Integer> prefixMaximumsUsingHeap(int[] nums) {
        Heap heap = new Heap();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            heap.insert(num);
            result.add(heap.getHeap().get(0));
        }
        return result;
    }

}
