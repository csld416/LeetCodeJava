import java.util.*;

public class L0645 {
    final static Scanner sc = new Scanner(System.in);

    public static int[] findErrorNums(int[] nums) {
        int cnt[] = new int[nums.length + 1];
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] == 2) {
                ans[0] = nums[i];
            }
        }
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == 0) {
                ans[1] = i;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(cnt));
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(findErrorNums(new int[]{2, 2})));
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