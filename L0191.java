import java.util.*;

public class L0191 {
    final static Scanner sc = new Scanner(System.in);

    public static int hammingWeight(int n) {
        if (n >= 0) {
            if (n == 0) {
                return 0;
            }
            int ans = 0;
            StringBuilder s = new StringBuilder(Integer.toString(n, 2));
            while (s.length() < 32) {
                s.insert(0, '0');
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    ans++;
                }
            }
            return ans;
        } else {
            int ans = 1;
            n *= -1;
            int i;
            StringBuilder s = new StringBuilder(Integer.toString(n, 2));
            while (s.length() < 32) {
                s.insert(0, '0');
            }
            System.out.println(s);
            for (i = s.length() - 1; i > -1; i--) {
                if (s.charAt(i) == '1') {
                    break;
                }
            }
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    ans++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(hammingWeight(-3));
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