import java.util.*;

public class L0867 {
    final static Scanner sc = new Scanner(System.in);

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int arr[][] = new int[n][m];
        for (int i = 0, i1 = 0; i < m; i++) {
            for (int j = 0, j1 = 0; j < n; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        int arr[][] = new int[][]{
                {1, 3, 5}, {2, 4, 6}
        };
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.deepToString(transpose(arr)));
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
    static int[] strtoarr(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        String w[] = sb.toString().split(",");
        int arr[] = new int[w.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(w[i]);
        }
        return arr;
    }
}