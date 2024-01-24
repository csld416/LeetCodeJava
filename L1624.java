import java.util.*;

public class L1624 {
    final static Scanner sc = new Scanner(System.in);

    public static int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        int ind[] = new int[128];
        Arrays.fill(ind, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ind[c] >= 0) {
                ans = Math.max(i - ind[c], ans);
            } else {
                ind[s.charAt(i)] = i;
            }
        }
        return ans == -1 ? -1 : ans - 1;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
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