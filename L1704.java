import java.util.*;

public class L1704 {
    final static Scanner sc = new Scanner(System.in);

    public static boolean halvesAreAlike(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        char c = '_';
        int ans = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            c = Character.toLowerCase(s.charAt(i));
            if (map.containsKey(c)) {
                ans++;
            }
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            c = Character.toLowerCase(s.charAt(i));
            if (map.containsKey(c)) {
                ans--;
            }
        }
        return ans == 0;
    }

    public static void main(String[] args) throws Throwable {
        String s = "AbCdEfGh";
        long startTime = System.currentTimeMillis();
        System.out.println(halvesAreAlike(s));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static ArrayList<Integer> StrToArrlist(String w) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(w);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String s[] = sb.toString().split(",");
        for (int i = 0; i < s.length; i++) {
            try {
                list.add(Integer.parseInt(s[i]));
            } catch (Exception e) {

            }
        }
        return list;
    }

    static int[] strtoarr(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String w[] = sb.toString().split(",");
        int arr[] = new int[w.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(w[i]);
        }
        return arr;
    }
}