import java.util.*;

public class L0661 {
    final static Scanner sc = new Scanner(System.in);

    public static int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] arr = new int[m][n];
        if (m == n && m == 1) {
            return new int[][]{{1}};
        }
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    arr[0][i] = (int) Math.floor((img[0][i] + img[0][i + 1]) / 2.0);
                } else if (i == n - 1) {
                    arr[0][i] = (int) Math.floor((img[0][i] + img[0][i - 1]) / 2.0);
                } else {
                    arr[0][i] = (int) Math.floor((img[0][i] + img[0][i - 1] + img[0][i + 1]) / 3.0);
                }
            }
            return arr;
        }
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                if (i == 0) {
                    arr[i][0] = (int) Math.floor((img[i][0] + img[i + 1][0]) / 2.0);
                } else if (i == m - 1) {
                    arr[i][0] = (int) Math.floor((img[i][0] + img[i - 1][0]) / 2.0);
                } else {
                    arr[i][0] = (int) Math.floor((img[i][0] + img[i - 1][0] + img[i + 1][0]) / 3.0);
                }
            }
            return arr;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0) {
                        arr[0][0] = (int) Math.floor((img[0][0] + img[0][1] + img[1][0] + img[i + 1][j + 1]) / 4.0);
                    } else if (j == n - 1) {
                        arr[0][n - 1] = (int) Math.floor((img[0][n - 1] + img[1][n - 1] + img[0][n - 2] + img[i + 1][j - 1]) / 4.0);
                    } else {
                        arr[i][j] = (int) Math.floor((img[i][j] + img[i][j - 1] + img[i][j + 1] + img[i + 1][j + 1] + img[i + 1][j - 1] + img[i + 1][j]) / 6.0);
                    }
                } else if (i == m - 1) {
                    if (j == 0) {
                        arr[m - 1][0] = (int) Math.floor((img[i - 1][j] + img[i][j] + img[i][j + 1] + img[i - 1][j + 1]) / 4.0);
                    } else if (j == n - 1) {
                        arr[i][j] = (int) Math.floor((img[i - 1][j] + img[i][j] + img[i][j - 1] + img[i - 1][j - 1]) / 4.0);
                    } else {
                        arr[i][j] = (int) Math.floor((img[i][j] + img[i][j - 1] + img[i][j + 1] + img[i - 1][j + 1] + img[i - 1][j - 1] + img[i - 1][j]) / 6.0);

                    }
                } else {
                    if (j == 0) {
                        arr[i][j] = (int) Math.floor((img[i][j] + img[i - 1][j] + img[i + 1][j] + img[i][j + 1] + img[i - 1][j + 1] + img[i + 1][j + 1]) / 6.0);
                    } else if (j == n - 1) {
                        arr[i][j] = (int) Math.floor((img[i][j] + img[i - 1][j] + img[i + 1][j] + img[i][j - 1] + img[i - 1][j - 1] + img[i + 1][j - 1]) / 6.0);
                    } else {
                        arr[i][j] = (int) Math.floor((img[i][j] + img[i - 1][j] + img[i + 1][j] + img[i][j + 1] + img[i][j - 1] + img[i - 1][j + 1] + img[i + 1][j + 1] + img[i - 1][j - 1] + img[i + 1][j - 1]) / 9.0);
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws Throwable {
        int arr[][] = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.deepToString(imageSmoother(arr)));
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