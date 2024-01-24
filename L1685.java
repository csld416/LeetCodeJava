import java.util.*;

public class L1685 {
    final static Scanner sc = new Scanner(System.in);

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int[] delta = new int[len];
        for (int i = 1; i < delta.length; i++) {
            delta[i] = delta[i - 1] + nums[i] - nums[i - 1];
        }
        ans[0] = Arrays.stream(delta).sum();
        for (int i = 1, j = 0, k = len - 2; i < ans.length; i++, j++, k--) {
            ans[i] = ans[i - 1] + j * (nums[i] - nums[i - 1]) - k * (nums[i] - nums[i - 1]);
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(strtoarr(s))));
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