import java.util.*;

public class L1347 {
    final static Scanner sc = new Scanner(System.in);

    public static int minSteps(String s, String t) {
        int cnt[] = new int[128];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            cnt[t.charAt(i)]--;
        }
        System.out.println(Arrays.toString(cnt));
        int ans = 0;
        for (int i = 0; i < cnt.length; i++) {
            ans += Math.abs(cnt[i]);
        }
        return ans % 2 == 0 ? (ans + 1) / 2 : ans / 2;
    }

    public static void main(String[] args) throws Throwable {
        String s = "bab";
        String t = "aba";
        long startTime = System.currentTimeMillis();
        System.out.println(minSteps(s, t));
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