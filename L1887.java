import java.util.*;

public class L1887 {
    final static Scanner sc = new Scanner(System.in);

    public static int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        if (nums[0] == max) {
            return 0;
        }
        int cnt[] = new int[max + 1];
        int stair = 0;
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }
        int ans = 0;
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] != 0){
                ans += cnt[i] * stair;
                stair++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(reductionOperations(strtoarr(s)));
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