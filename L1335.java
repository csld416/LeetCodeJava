import java.util.*;

public class L1335 {
    final static Scanner sc = new Scanner(System.in);

    Integer dp[][];

    public int minDifficulty(int[] jobDiff, int d) {
        if (d > jobDiff.length) {
            return -1;
        }
        dp = new Integer[jobDiff.length][d + 1];
        int res = diff(0, jobDiff, d);
        if (res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;
    }

    private int diff(int curr, int jobDiff[], int d) {
        if (curr >= jobDiff.length && d <= 0) {
            return 0;
        }
        if (curr >= jobDiff.length || d <= 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[curr][d] != null) {
            return dp[curr][d];
        }
        int maxDiff = -1;
        int res = Integer.MAX_VALUE;
        for (int i = curr; i < jobDiff.length; i++) {
            maxDiff = Math.max(maxDiff, jobDiff[i]);
            int temp = diff(i + 1, jobDiff, d - 1);
            if (temp != Integer.MAX_VALUE) res = Math.min(res, maxDiff + temp);
        }
        return dp[curr][d] = res;
    }


    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

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