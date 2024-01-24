import java.util.*;

public class L1838 {
    final static Scanner sc = new Scanner(System.in);

    public static int maxFrequency(int[] nums, int k) {
        if (nums.length == 1) {
            return 1;
        }
        return 0;
    }


    public static void main(String[] args) throws Throwable {
        String s = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        long startTime = System.currentTimeMillis();
        System.out.println(maxFrequency(strtoarr(s), k));
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

    public static int maxFrequency1(int[] nums, int k) {
        if (nums.length == 1) {
            return 1;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int sum = Arrays.stream(nums).sum() + k;
        int avg = (int) Math.round(sum * 1.0 / nums.length);
        System.out.println("avg = " + avg);
        if (nums[0] < avg && avg < nums[1]) {
            return 1;
        }
        int lock = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < avg && avg < nums[i]) {
                lock = i - 1;
                break;
            }
            if (nums[i] == avg) {
                lock = i;
            }
        }
        System.out.println("lock = " + lock);
        int ans = 0;
        for (int i = lock; i > -1; i--) {
            int delta = avg - nums[i];
            System.out.printf("delta = avg - nums[%d] = %d\n", i, delta);
            if (delta > k) {
                break;
            } else {
                k -= delta;
                ans++;
            }
        }
        return ans;
    }
}