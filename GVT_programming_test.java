import java.util.*;

/**
 * Author cho1r
 * 2022/04/26 13:04
 * GVT programming test
 */
public class GVT_programming_test {
    public static void main(String[] args) {
        /**
         * Example 1
         * arr= [3,3,4,4,4,5,6]
         *
         * Most occurring
         * 4
         *
         *
         * Example 2
         * arr= [5,5,5,6,6,6,7]
         *
         * Most occurring
         * 5(3), 6(3)
         *
         * Biggest number:
         * 6
         */

        // 1. array to list
        Integer[] arr = {5, 5, 5, 6, 6, 6, 7};
//        Integer[] arr = {3, 3, 4, 4, 4, 5, 6};
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);

        // Stores the value and the number of times it appears
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer integer : list) {
            // 2. Get the number of occurrences of this value, 0 if not in the result map
            Integer count = map.getOrDefault(integer, 0);
            // Occur once plus 1
            map.put(integer, count + 1);
        }
//        System.out.println(map);

        // Store the most frequent value and count
        HashMap<Integer, Integer> mapMax = new HashMap<>(map);

        // 3. Get the most frequent occurrences
        Integer max = map.values().stream().max(Comparator.comparingInt(x -> x)).get();
        // Remove below max
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != max) {
                mapMax.remove(entry.getKey());
            }
        }

        // 4. output result
        // Most occurring
//        System.out.println(mapMax);
        String result = "";
        for (Map.Entry<Integer, Integer> entry : mapMax.entrySet()) {
            result += entry.getKey() + "(" + entry.getValue() + "), ";
        }
        // remove the last ", "
        result = result.substring(0, result.length() - 2);
        System.out.println("Most occurring");
        System.out.println(result);

        // Biggest number
        if (mapMax.size() > 1) {
            System.out.println("Biggest number");
            System.out.println(mapMax.keySet().stream().max(Comparator.comparingInt(x -> x)).get());
        }
    }
}
