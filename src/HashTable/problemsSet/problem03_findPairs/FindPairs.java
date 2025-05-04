package HashTable.problemsSet.problem03_findPairs;

import java.util.*;
import java.util.stream.Collectors;

public class FindPairs {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;
        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

    private static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> numSet = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        List<int[]> result = new ArrayList<>();
        for (int n : arr2) {
            if (numSet.contains(target - n)) {
                result.add(new int[]{target - n, n});
            }
        }
        return result;
    }

}
