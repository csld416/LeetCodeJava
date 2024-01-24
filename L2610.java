import java.lang.reflect.Array;
import java.util.*;

public class L2610 {
    final static Scanner sc = new Scanner(System.in);

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int cnt[] = new int[201];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }
        while (Arrays.stream(cnt).sum() > 0) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < cnt.length; i++) {
                if (cnt[i] > 0) {
                    tmp.add(i);
                    cnt[i]--;
                }
            }
            list.add(tmp);
        }
        return list;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

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