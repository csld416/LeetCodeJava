import java.util.*;

public class L1155 {
    final static Scanner sc = new Scanner(System.in);

    public static int numRollsToTarget(int n, int k, int target) {
        int mod = (int) 1e9 + 7;
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;

        for (int num = 1; num <= n; num++) {
            for (int tar = 1; tar <= target; tar++) {
                for (int face = 1; face <= k; face++) {
                    if (tar - face >= 0) {
                        dp[num][tar] = (dp[num][tar] + dp[num - 1][tar - face]) % mod;
                    }
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[n][target];
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(numRollsToTarget(4, 6, 5));
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