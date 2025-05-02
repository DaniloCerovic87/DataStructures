package HashTable.problemsMap.problem05_twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 4}, 8)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
    }

    private static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(target - array[i])) {
                result[0] = Math.min(i, map.get(target - array[i]));
                result[1] = Math.max(i, map.get(target - array[i]));
                return result;
            }
            map.put(array[i], i);
        }

        return new int[]{};
    }

}
