import java.util.*;

public class L0413 {
    final static Scanner sc = new Scanner(System.in);

    public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return 0;
        }
        int ans = 0;
        int len = 3;
        while (len <= n) {
            // System.out.println("len = " + len);
            for (int i = 0; i + len <= n; i++) {
                int delta = nums[i + 1] - nums[i];
                boolean t = true;
                for (int j = i + 1; j <= i + len - 1; j++) {
                    //System.out.printf("%d, %d\n", nums[j - 1], nums[j]);
                    if (nums[j] - nums[j - 1] != delta) {
                        t = false;
                        break;
                    }
                }
                ans += t ? 1 : 0;
            }
            len++;
        }
        return ans;
    }

    public int numberOfArithmeticSlices1(int[] nums) {

        if (nums.length < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i + 2 < nums.length && nums[i + 1] - nums[i] == nums[i + 2] - nums[i + 1]) {
                int d = nums[i + 1] - nums[i];
                count++;

                for (int j = i + 2; j < nums.length - 1 && nums[j + 1] - nums[j] == d; j++) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws Throwable {
        int arr[] = new int[]{1, 2, 3, 4};
        long startTime = System.currentTimeMillis();
        System.out.println(numberOfArithmeticSlices(arr));
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