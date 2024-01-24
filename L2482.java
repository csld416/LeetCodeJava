import java.util.*;

public class L2482 {
    final static Scanner sc = new Scanner(System.in);

    public static class num {
        int left;
        int right;

        num() {
        }

        num(int a, int b) {
            this.left = a;
            this.right = b;
        }
    }

    public static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] diff = new int[m][n];
        int[] oneRow = new int[m];
        int[] oneCol = new int[n];
        for (int i = 0; i < m; i++) {
            oneRow[i] = Arrays.stream(grid[i]).sum();
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += grid[j][i];
            }
            oneCol[i] = sum;
        }
        System.out.println(Arrays.toString(oneCol));
        System.out.println(Arrays.toString(oneRow));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = oneRow[i] + oneCol[j] - (m - oneRow[i]) - (n - oneCol[j]);
            }
        }
        return diff;
    }

    public static void main(String[] args) throws Throwable {
        int arr[][] = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 1}
        };
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.deepToString(onesMinusZeros(arr)));
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