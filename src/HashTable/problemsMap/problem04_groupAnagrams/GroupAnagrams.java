package HashTable.problemsMap.problem04_groupAnagrams;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));
    }

    private static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (anagrams.containsKey(sorted)) {
                anagrams.get(sorted).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                anagrams.put(sorted, list);
            }
        }
        return new ArrayList<>(anagrams.values());
    }

}
