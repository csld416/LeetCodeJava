import java.util.*;

public class L0931 {
    final static Scanner sc = new Scanner(System.in);

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            ans[0][i] = matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    ans[i][j] = matrix[i][j] + Math.min(ans[i - 1][j], ans[i - 1][j + 1]);
                } else if (j == n - 1) {
                    ans[i][j] = matrix[i][j] + Math.min(ans[i - 1][j], ans[i - 1][j - 1]);
                } else {
                    ans[i][j] = matrix[i][j] + Math.min(Math.min(ans[i - 1][j - 1], ans[i - 1][j]), Math.min(ans[i - 1][j], ans[i - 1][j + 1]));
                }
            }
        }
        return Arrays.stream(ans[n - 1]).min().getAsInt();
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