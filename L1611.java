import java.util.*;

public class L1611 {
    final static Scanner sc = new Scanner(System.in);

    public static int minimumOneBitOperations(int n) {
        StringBuilder bit = new StringBuilder(Integer.toString(n, 2));
        bit.reverse();
        int len = bit.length();
        int ans = 0, i, k;
        ArrayList<Integer> list = new ArrayList<>();
        for (i = 0; i < len; i++) {
            if (bit.charAt(i) == '1') {
                list.add(i);
            }
        }
        System.out.println(list);
        for (int j = 0; j < list.size(); j++) {
            ans += (int) Math.pow(2, list.get(j) + 1) - 1;
        }
        return ans;
    }


    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(minimumOneBitOperations(3));
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