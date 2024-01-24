import java.util.*;

public class L1841 {
    final static Scanner sc = new Scanner(System.in);

    public static int countNicePairs(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);
        if (nums[0] == nums[nums.length - 1]) {
            int len = nums.length;
            long u = (long) len * (len - 1) / 2;
            return (int) (u % ((int) Math.pow(10, 9) + 7));
        }
        int rev[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(nums[i]));
            rev[i] = nums[i] - Integer.parseInt(sb.reverse().toString());
        }
        Arrays.sort(rev);
        System.out.println(Arrays.toString(rev));
        long ans = 0;
        int count = 1;
        for (int i = 1; i < rev.length; i++) {
            if (rev[i] == rev[i - 1]) {
                count++;
            } else {
                ans += (long) count * (count - 1) / 2;
                count = 1;
            }
        }
        if (rev[rev.length - 1] == rev[rev.length - 2]) {
            ans += (long) count * (count - 1) / 2;
        }
        return (int) (ans % ((int) Math.pow(10, 9) + 7));
    }

    public static void main(String[] args) throws Throwable {
        String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(countNicePairs(strtoarr(s)));
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