import java.util.*;

public class L1266 {
    final static Scanner sc = new Scanner(System.in);

    public static int toTime(int[] a, int[] b) {
        int deltaX = Math.abs(a[0] - b[0]);
        int deltaY = Math.abs(a[1] - b[1]);
        return Math.max(deltaX, deltaY);
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 1; i < points.length; i++) {
            ans += toTime(points[i - 1], points[i]);
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        int[][] arr = {
                {1, 1},
                {3, 4},
                {-1, 0}
        };
        System.out.println(minTimeToVisitAllPoints(arr));
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