import java.util.*;

public class L1481 {
    final static Scanner sc = new Scanner(System.in);

    public static int findLeastNumOfUniqueInts_Memout(int[] arr, int k) {
        int max = Arrays.stream(arr).max().getAsInt();
        int cnt[] = new int[max + 1];
        for (int i : arr) {
            cnt[i]++;
        }
        Arrays.sort(cnt);
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                if (k >= cnt[i]) {
                    k -= cnt[i];
                    cnt[i] = 0;
                } else {
                    break;
                }
            }
        }
        int ans = 0;
        for (int i : cnt) {
            if (i > 0) {
                ans++;
            }
        }
        return ans;
    }

    public static int findLeastNumOfUniqueInts(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                map.put(i, val + 1);
            } else {
                map.put(i, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                if (k >= list.get(i)) {
                    k -= list.get(i);
                    list.set(i, 0);
                } else {
                    break;
                }
            }
        }
        int ans = 0;
        for (int i : list) {
            if (i > 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        int arr[] = new int[]{4, 3, 1, 1, 3, 3, 2};
        System.out.println(findLeastNumOfUniqueInts(arr, 3));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}
/*

 * */