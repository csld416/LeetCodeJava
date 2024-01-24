import java.util.*;

public class L1235 {
    final static Scanner sc = new Scanner(System.in);

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));// sort the 2d array based on the a[1] value(end time)
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs) {
            int val = job[2] + dp.floorEntry(job[0]).getValue();
            if (val > dp.lastEntry().getValue()) {
                dp.put(job[1], val);
            }
        }
        return dp.lastEntry().getValue();
    }

    public static void main(String[] args) throws Throwable {
        int st[] = strtoarr(sc.nextLine());
        int ed[] = strtoarr(sc.nextLine());
        int pro[] = strtoarr(sc.nextLine());
        long startTime = System.currentTimeMillis();
        System.out.println(jobScheduling(st, ed, pro));
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