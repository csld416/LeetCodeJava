import java.util.*;

public class L0368 {
    final static Scanner sc = new Scanner(System.in);

    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        Arrays.fill(dp, 1);

        int maxSize = 1, maxIndex = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] % nums[j] == 0){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }
        int num = nums[maxIndex];
        for (int i = maxIndex; i >= 0; i--) {
            if (num % nums[i] == 0 && dp[i] == maxSize) {
                list.add(nums[i]);
                num = nums[i];
                maxSize--;
            }
        }

        return list;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}