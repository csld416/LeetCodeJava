import java.util.*;

public class L2264 {
    final static Scanner sc = new Scanner(System.in);

    public static String largestGoodInteger(String num) {
        int val = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            String sub = num.substring(i, i + 3);
            if (sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)) {
                val = Math.max(Integer.parseInt(sub), val);
            }
        }
        if (val == 0) {
            return "000";
        }
        if (val == -1) {
            return "";
        }
        return Integer.toString(val);
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(largestGoodInteger("222"));
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