package HashTable.problemsMap.problem06_subarraySum;

import java.util.Arrays;

public class SubarraySum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subarraySumSlidingWindow(new int[]{1, 2, 3, 7, 5}, 12)));
        System.out.println(Arrays.toString(subarraySumSlidingWindow(new int[]{1, 2, 3, 4, 5}, 20)));
    }

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
