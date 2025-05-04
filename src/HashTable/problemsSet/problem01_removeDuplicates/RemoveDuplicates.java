package HashTable.problemsSet.problem01_removeDuplicates;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6)));
        System.out.println(removeDuplicates(Arrays.asList(1, 1, 2, 2, 3, 3)));
    }

    private static List<Integer> removeDuplicates(List<Integer> nums) {
        Set<Integer> numsSet = new LinkedHashSet<>(nums);
        return new ArrayList<>(numsSet);
    }

}
