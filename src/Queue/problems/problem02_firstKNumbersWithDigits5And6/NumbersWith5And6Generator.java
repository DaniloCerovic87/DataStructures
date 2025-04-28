package Queue.problems.problem02_firstKNumbersWithDigits5And6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumbersWith5And6Generator {

    public static void main(String[] args) {
        System.out.println(generateNumbersWith5And6(7));
        System.out.println(generateNumbersWith5And6(12));
    }

    private static List<String> generateNumbersWith5And6(int k) {
        List<String> result = new LinkedList<>();
        if (k <= 0) {
            return result;
        }

        LinkedList<String> list = new LinkedList<>();
        list.addLast("5");
        list.addLast("6");

        while (result.size() < k) {
            String current = list.removeFirst();
            result.add(current);

            list.addLast(current + "5");
            list.addLast(current + "6");
        }

        return result;
    }
}
