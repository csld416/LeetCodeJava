import java.util.*;

public class L0026 {
    final static Scanner sc = new Scanner(System.in);

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
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

}