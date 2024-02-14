import java.util.*;

public class L0279 {
    final static Scanner sc = new Scanner(System.in);

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; ++i) {
            int ans = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; ++j) {
                ans = Math.min(ans, dp[i - j * j] + 1);
            }
            dp[i] = ans;
        }
        return dp[n];
    }


    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println(numSquares(12));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}