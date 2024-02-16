import java.util.*;

public class L2971 {
    final static Scanner sc = new Scanner(System.in);

    public static long largestPerimeter(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return -1;
        }
        Arrays.sort(nums);
        if (nums[0] == nums[n - 1]) {
            return (long) n * nums[0];
        }
        long presum[] = new long[n];
        presum[0] = nums[0];
        for (int i = 1; i < presum.length; i++) {
            presum[i] = nums[i] + presum[i-1];
        }
        for (int i = n-1; i > -1; i--) {
            if(presum[i-1] > nums[i]){
                return presum[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println(largestPerimeter(new int[]{1,12,1,2,5,50,3}));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}