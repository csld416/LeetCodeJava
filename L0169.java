import java.util.*;

public class L0169 {
    final static Scanner sc = new Scanner(System.in);

    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        double n = ((double) nums.length / 2);
        Arrays.sort(nums);
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                cnt++;
            } else {
                cnt = 1;
            }
            if (cnt > Math.floor(n)) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}