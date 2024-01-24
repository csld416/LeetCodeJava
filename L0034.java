import java.util.Arrays;
import java.util.Scanner;

public class L0034 {

    final static Scanner sc = new Scanner(System.in);

    public static int[] searchRange(int[] nums, int target) {
        int[] out = {-1, -1};
        if (nums.length == 0) {
            return out;
        }
        if (target > nums[nums.length - 1]) {
            return out;
        }
        int res = Arrays.binarySearch(nums, target);
        if (res < 0) {
            return out;
        }
        int a = 0, b = 0;
        for (int i = res; i < nums.length; i++) {
            if (nums[i] != target) {
                break;
            } else {
                b = i;
            }
        }
        for (int i = res; i > -1; i--) {
            if (nums[i] != target) {
                break;
            } else {
                a = i;
            }
        }
        if (a == b) {
            int[] outy = {a, a};
            return outy;
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) throws Throwable {
        int nums[] = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 6)));
    }
}
