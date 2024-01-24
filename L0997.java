import java.util.*;

public class L0997 {
    final static Scanner sc = new Scanner(System.in);


    public static int findJudge(int n, int[][] trust) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            if (trust.length == 1) {
                return trust[0][1];
            }
        }
        int per[] = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            per[trust[i][1]]++;
        }
        System.out.println(Arrays.toString(per));
        for (int i = 1; i < per.length; i++) {
            if (per[i] == n - 1) {
                for (int j = 0; j < trust.length; j++) {
                    if (trust[j][0] == i) {
                        return -1;
                    }
                }
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(findJudge(4, new int[][]{
                {1, 4}, {1, 3}, {4, 3}, {2, 3}, {2, 4}
        }));
        System.out.println(findJudge(3, new int[][]{{1, 3}, {2, 3}}));
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