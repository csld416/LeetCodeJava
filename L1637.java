import java.util.*;

public class L1637 {
    final static Scanner sc = new Scanner(System.in);

    public int maxWidthOfVerticalArea(int[][] points) {
        int arr[] = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int max = -1;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i] - arr[i-1], max);
        }
        return max;
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