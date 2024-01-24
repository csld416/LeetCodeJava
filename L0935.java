import java.util.*;

public class L0935 {
    final static Scanner sc = new Scanner(System.in);
    static final int[][] cache = new int[5001][10];
    static final int[][] path = {
            /*0*/ {4, 6},
            /*1*/ {6, 8},
            /*2*/ {7, 9},
            /*3*/ {4, 8},
            /*4*/ {0, 3, 9},
            /*5*/ {},
            /*6*/ {0, 1, 7},
            /*7*/ {2, 6},
            /*8*/ {1, 3},
            /*9*/ {2, 4}
    };

    public static int knightDialer(int n) {
        int[][] path = {
                /*0*/ {4, 6},
                /*1*/ {6, 8},
                /*2*/ {7, 9},
                /*3*/ {4, 8},
                /*4*/ {0, 3, 9},
                /*5*/ {},
                /*6*/ {0, 1, 7},
                /*7*/ {2, 6},
                /*8*/ {1, 3},
                /*9*/ {2, 4}
        };
        final int mod = (int) 1e9 + 7;
        int[][] dp = new int[5001][10];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 1) {
                    dp[i][j] = 1;
                } else {
                    for (int k = 0; k < path[j].length; k++) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][path[j][k]]) % mod;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        int result = 0;
        for (int j = 0; j < 10; j++) {
            result = (result + dp[n][j]) % mod;
        }
        return result;
    }

    static int knightDialer(int remainingLEN, int[] nextNumbers) {
        if (remainingLEN == 1) {
            return nextNumbers.length;
        }
        int count = 0;

        for (int nextNumber : nextNumbers) {
            int cur = cache[remainingLEN][nextNumber];
            if (cur == 0) {
                cur = knightDialer(remainingLEN - 1, path[nextNumber]);
                cache[remainingLEN][nextNumber] = cur;
            }
            count += cur;
            count %= (int) 1e9 + 7;
        }
        return count;
    }

    public static long f(int n, int d) {
        if (n == 0) {
            return 1;
        }
        if (d == 0) {
            return f(n - 1, 4) + f(n - 1, 6);
        } else if (d == 1) {
            return f(n - 1, 6) + f(n - 1, 8);
        } else if (d == 2) {
            return f(n - 1, 7) + f(n - 1, 9);
        } else if (d == 3) {
            return f(n - 1, 4) + f(n - 1, 8);
        } else if (d == 4) {
            return f(n - 1, 3) + f(n - 1, 9) + f(n - 1, 0);
        } else if (d == 6) {
            return f(n - 1, 1) + f(n - 1, 7) + f(n - 1, 0);
        } else if (d == 7) {
            return f(n - 1, 2) + f(n - 1, 6);
        } else if (d == 8) {
            return f(n - 1, 1) + f(n - 1, 3);
        } else if (d == 9) {
            return f(n - 1, 4) + f(n - 1, 2);
        }
        return 0;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(knightDialer(3131));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static ArrayList<Integer> StrToArrlist(String w) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(w);
        sb.deleteCharAt(0);
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