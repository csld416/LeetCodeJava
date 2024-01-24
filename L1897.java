import java.util.*;

public class L1897 {
    final static Scanner sc = new Scanner(System.in);

    public static boolean makeEqual(String[] words) {
        if (words.length == 1) {
            return true;
        }
        int[] cnt = new int[128];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                cnt[words[i].charAt(j)]++;
            }
        }
        System.out.println(Arrays.toString(cnt));
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                if (cnt[i] % words.length != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(makeEqual(new String[]{"caaaaa", "aaaaaaaaa", "a", "bbb", "bbbbbbbbb", "bbb", "cc", "cccccccccccc", "ccccccc", "ccccccc", "cc", "cccc", "c", "cccccccc", "c"}));
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