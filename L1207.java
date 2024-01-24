import java.util.*;

public class L1207 {
    final static Scanner sc = new Scanner(System.in);

    public static boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1]) {
                    if (list.contains(1)) {
                        return false;
                    }
                }
            } else {
                if (arr[i] == arr[i + 1]) {
                    cnt++;
                } else {
                    if (!list.contains(cnt)) {
                        list.add(cnt);
                        cnt = 1;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
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