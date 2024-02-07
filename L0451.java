import java.util.*;

public class L0451 {
    final static Scanner sc = new Scanner(System.in);

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int n = map.get(c);
                map.put(c, n + 1);
            } else {
                map.put(c, 1);
            }
            System.out.println(map);

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        list.sort(Collections.reverseOrder());
        for (int num : list) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            int n = entry.getValue();
            while (n-- > 0) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println(frequencySort("tree"));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}