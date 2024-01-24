import java.util.*;

public class L1422 {
    final static Scanner sc = new Scanner(System.in);

    public static int maxScore(String s) {
        int one[] = new int[s.length()];
        int zero[] = new int[s.length()];
        int on = 0, z = 0;

        for (int i = 0, j = zero.length - 1; i < zero.length; i++, j--) {
            if (s.charAt(i) == '0') {
                z++;
                zero[i] = z;
            }
            if (s.charAt(j) == '1') {
                on++;
                one[j] = on;
            }
        }
        int ans = -1;
        for (int i = 1; i < s.length(); i++) {
            ans = Math.max(ans, one[i] + zero[i - 1]);
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(maxScore("011101"));
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