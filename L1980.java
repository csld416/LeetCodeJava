import java.util.*;

public class L1980 {
    final static Scanner sc = new Scanner(System.in);

    public static String findDifferentBinaryString(String[] nums) {
        ArrayList<Integer> inte = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            inte.add(Integer.parseInt(nums[i], 2));
        }
        StringBuilder ans = new StringBuilder();
        int max = (int) Math.pow(2, nums.length) - 1;
        for (int i = 0; i <= max; i++) {
            if (!inte.contains(i)) {
                ans = new StringBuilder(Integer.toBinaryString(i));
            }
        }
        while (ans.length() < nums.length) {
            ans.insert(0, "0");
        }
        return ans.toString();
    }

    public static void main(String[] args) throws Throwable {
        String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(findDifferentBinaryString(strtoarr(s)));
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

    static String[] strtoarr(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String w[] = sb.toString().split(",");
        for (int i = 0; i < w.length; i++) {
            sb = new StringBuilder(w[i]);
            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length() - 1);
            w[i] = (sb.toString());
        }
        return w;
    }
}