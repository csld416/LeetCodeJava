import java.util.*;

public class L0136 {
    final static Scanner sc = new Scanner(System.in);

    public static int[] singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if (nums.length == 1) {
            return new int[]{nums[0]};
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (count != 2) {
                    list.add(nums[i - 1]);
                } else {
                    count = 1;
                }
            } else {
                count++;
            }
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            list.add(nums[nums.length - 1]);
        }
        int ans[] = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        System.out.println(singleNumber(arr(sc.nextLine())));

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static int[] arr(String w) {
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
        int r[] = new int[list.size()];
        for (int i = 0; i < r.length; i++) {
            r[i] = list.get(i);
        }
        return r;
    }

}