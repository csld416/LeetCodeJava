import java.util.*;

public class L1903 {
    final static Scanner sc = new Scanner(System.in);

    public static String largestOddNumber(String num) {
        int ind = -1;
        for (int i = num.length() - 1; i > -1; i--) {
            if (Integer.parseInt(num.substring(i, i+1)) % 2 == 1) {
                ind = i;
                break;
            }
        }
        return ind >= 0 ? num.substring(0, ind + 1) : "";
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        String s = "7542351161";
        System.out.println(s.substring(0, 10));
        System.out.println(largestOddNumber("7542351161"));
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