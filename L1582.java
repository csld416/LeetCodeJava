import java.util.*;

public class L1582 {
    final static Scanner sc = new Scanner(System.in);

    public static int numSpecial(int[][] mat) {
        int sum[] = new int[mat.length];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = Arrays.stream(mat[i]).sum();
        }
        int cnt = 0;
        for (int i = 0; i < mat.length; i++) {
            if (sum[i] == 1) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == 1) {
                        int ss = 0;
                        for (int k = 0; k < sum.length; k++) {
                            ss += mat[k][j];
                        }
                        if (ss == 1) {
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        //System.out.println(numSpecial());
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