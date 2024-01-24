import java.util.*;

public class L1727 {
    final static Scanner sc = new Scanner(System.in);

    public static int largestSubmatrix(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    sum++;
                    matrix[j][i] = sum;
                } else {
                    sum = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            for (int j = matrix[i].length - 1, cnt = 1; j > -1; j--, cnt++) {
                if (matrix[i][j] == 0) {
                    break;
                }
                ans = Math.max(ans, matrix[i][j] * cnt);
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        int arr[][] = new int[1][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        long startTime = System.currentTimeMillis();
        System.out.println(largestSubmatrix(arr));
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