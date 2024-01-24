import java.util.*;

public class L1688 {
    final static Scanner sc = new Scanner(System.in);

    public static int numberOfMatches(int n) {
        System.out.println("n = " + n);
        if (n == 1) {
            return 0;
        }
        if (n > 0) {
            if (n % 2 == 0) {
                return n / 2 + numberOfMatches(n / 2);
            } else {
                return (n - 1) / 2 + numberOfMatches((n - 1) / 2 + 1);
            }
        } else {
            return 0;
        }
    }


    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(numberOfMatches(7 * 2));
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