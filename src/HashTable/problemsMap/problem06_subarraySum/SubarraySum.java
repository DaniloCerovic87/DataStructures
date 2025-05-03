package HashTable.problemsMap.problem06_subarraySum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subarraySumPrefixSumAndMap(new int[]{1, 2, 3, 7, 5}, 13)));
        System.out.println(Arrays.toString(subarraySumPrefixSumAndMap(new int[]{1, 2, 3, 4, 5}, 20)));
    }

    private static int[] subarraySumPrefixSumAndMap(int[] nums, int target) {
        Map<Integer, Integer> prefixSumPositions = new HashMap<>();
        int sum = 0;

        prefixSumPositions.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (prefixSumPositions.containsKey(sum - target)) {
                return new int[]{prefixSumPositions.get(sum - target) + 1, i};
            }

            prefixSumPositions.put(sum, i);

        }
        return new int[]{};
    }


    // works with positive numbers only
    private static int[] subarraySumSlidingWindow(int[] nums, int target) {
        int start = 0;
        int sum = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum > target && start <= end) {
                sum -= nums[start++];
            }

            if (target == sum) {
                return new int[]{start, end};
            }
        }
        return new int[]{};
    }

}
