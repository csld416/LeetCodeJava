import java.util.*;

public class L1846 {
    final static Scanner sc = new Scanner(System.in);

    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        Arrays.sort(arr);
        if (arr.length == 1) {
            return 1;
        }
        if (arr.length > max) {
            if (min == max) {
                if (min == 1) {
                     return 1;
                }
                return min + 1;
            }
            if (arr[arr.length - 1] - arr[arr.length - 2] > 1) {
                return (arr[arr.length - 2] + 1);
            }
            return max;
        }
        if (arr[arr.length - 1] - arr[arr.length - 2] > 1 && arr.length == max) {
            return (arr[arr.length - 2] + 1);
        }
        return arr.length;
    }

    public static void main(String[] args) throws Throwable {
        String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(maximumElementAfterDecrementingAndRearranging(strtoarr(s)));
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