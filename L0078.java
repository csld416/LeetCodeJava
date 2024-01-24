import java.util.*;

public class L0078 {
    final static Scanner sc = new Scanner(System.in);

    public static List<List<Integer>> slidingwindowset(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        List<Integer> list = new ArrayList<>();
        for (int winsize = 1; winsize <= nums.length; winsize++) {
            System.out.println("winsize = " + winsize);
            for (int i = 0; i < nums.length; i += 1) {
                list.clear();
                if (i + winsize > nums.length) {
                    break;
                }
                System.out.println("i = " + i);
                for (int j = i; j <= i + winsize - 1; j++) {
                    System.out.printf("adding nums[%d] into list\n", j);
                    list.add(nums[j]);
                }
                System.out.println(list);
                ans.add(new ArrayList<>(list));
            }
            System.out.println("====================");
        }
        return ans;
    }

    static List<List<Integer>> subsets(int[] set) {
        long pow_set_size = (long) Math.pow(2, set.length);
        int counter, j;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (counter = 0; counter < pow_set_size; counter++) {
            list.clear();
            for (j = 0; j < set.length; j++) {
                if ((counter & (1 << j)) > 0) {
                    list.add(set[j]);
                }
            }
            ans.add(new ArrayList<>(list));
            System.out.println();
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        // String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(subsets((new int[]{1, 2, 3, 4, 5})));
        ;
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