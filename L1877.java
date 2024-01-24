import java.util.*;

public class L1877 {
    final static Scanner sc = new Scanner(System.in);



    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int pair[] = new int[nums.length/2];
        for (int i = 0, j = nums.length-1; i < pair.length; i++, j--) {
            pair[i] = nums[i] + nums[j];
        }
        int max = 0;
        for (int i = 0; i < pair.length; i++) {
            max = Math.max(max, pair[i]);
        }
        return max;
    }

    public static void main(String[] args) throws Throwable {
        String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(minPairSum(strtoarr(s)));
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
    static int[] strtoarr(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        String w[] = sb.toString().split(",");
        int arr[] = new int[w.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(w[i]);
        }
        return arr;
    }
}