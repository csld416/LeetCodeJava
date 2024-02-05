import java.util.*;

public class L1043 {
    final static Scanner sc = new Scanner(System.in);

    public static int maxSumAfterPartitioning(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans = 0;
        for (int i = arr.length - 1; i > -1; i--) {
            if (len == 0) {
                break;
            }
            if (len >= k) {
                if (!list.contains(arr[i])) {
                    ans += arr[i] * k;
                    list.add(arr[i]);
                    len -= k;
                }
            } else {
                ans += arr[i] * len;
                len = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {

        int arr[] = new int[]{1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3};
        int k = 4;
        long startTime = System.currentTimeMillis();
        System.out.println(maxSumAfterPartitioning(arr, k));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}