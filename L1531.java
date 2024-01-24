import java.util.*;

public class L1531 {
    final static Scanner sc = new Scanner(System.in);

    static int calculateLength(int count) {
        return (count > 1) ? 1 + Integer.toString(count).length() : 1;
    }

    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        int[][] dp = new int[110][110];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                dp[i][j] = 9999;
        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                int cnt = 0, del = 0;
                for (int l = i; l >= 1; l--) {
                    if (s.charAt(l - 1) == s.charAt(i - 1))
                        cnt++;
                    else
                        del++;

                    if (j - del >= 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[l - 1][j - del] + 1 + (cnt >= 100 ? 3 : cnt >= 10 ? 2 : cnt >= 2 ? 1 : 0));
                    }
                }
                if (j > 0)
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]);
            }
        }
        return dp[n][k];
    }

    public static String compress(String s) {
        int cnt;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            cnt = 0;
            int j = i;
            while (s.charAt(j) == c) {
                cnt++;
                if (j == s.length() - 1) {
                    break;
                } else {
                    j++;
                }
            }
            i = j - 1;
            ans.append(c);
            if (cnt > 1) {
                ans.append(cnt);
            }
        }
        if (s.charAt(s.length() - 1) != s.charAt(s.length() - 2)) {
            ans.append(s.charAt(s.length() - 1));
        }
        return ans.toString();
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