package HashTable.problemsSet.problem04_longestConsecutiveSequence;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsecutiveSequence(new int[]{1, 3, 2, 4, 6, 7}));
        System.out.println(longestConsecutiveSequence(new int[]{1, 1, 1}));
        System.out.println(longestConsecutiveSequence(new int[]{2, 1, 1}));
        System.out.println(longestConsecutiveSequence(new int[]{}));
    }

    private static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int maxResult = 0;

        for (Integer num : numsSet) {
            if (numsSet.contains(num - 1)) {
                continue;
            }
            int result = 1;
            int next = num + 1;

            while (numsSet.contains(next)) {
                result++;
                next++;
            }

            maxResult = Math.max(maxResult, result);
        }
        return maxResult;
    }

}
