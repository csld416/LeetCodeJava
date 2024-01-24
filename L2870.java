import java.util.*;

public class L2870 {
    final static Scanner sc = new Scanner(System.in);

    public int minOperations(int[] nums) {
        int cnt[] = new int[(int) 1e6 + 1];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }
        int ans = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 0) {
                continue;
            }
            if (cnt[i] == 1) {
                return -1;
            }
            while (cnt[i] > 0) {
                if (cnt[i] > 2) {
                    cnt[i] -= 3;
                } else {
                    cnt[i] -= 2;
                }
                ans++;
            }
        }
        return ans;
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