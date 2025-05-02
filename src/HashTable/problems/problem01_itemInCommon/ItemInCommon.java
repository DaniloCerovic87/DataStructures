package HashTable.problems.problem01_itemInCommon;

import java.util.HashMap;
import java.util.Map;

public class ItemInCommon {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        int[] array3 = {2, 4, 6};
        System.out.println(itemInCommon(array1, array2));
        System.out.println(itemInCommon(array1, array3));
    }

    private static boolean itemInCommon(int[] array1, int[] array2) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int e : array1) {
            map.put(e, true);
        }

        for (int e : array2) {
            if (map.get(e) != null) {
                return true;
            }
        }
        return false;
    }

}
