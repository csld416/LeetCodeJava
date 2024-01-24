import java.util.*;

public class L0455 {
    final static Scanner sc = new Scanner(System.in);

    public static int findContentChildren(int[] g, int[] s) {
        if (s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        for (int i = 0, j = 0; i < g.length; ) {
            if (s[j] >= g[i]) {
                ans++;
                i++;
            }
            j++;
            if (j > s.length - 1) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        int g[] = new int[]{7, 8, 9, 10};
        int s[] = new int[]{5, 6, 7, 8};
        long startTime = System.currentTimeMillis();
        System.out.println(findContentChildren(g, s));
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