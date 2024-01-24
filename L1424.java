import java.lang.reflect.Array;
import java.util.*;

public class L1424 {
    final static Scanner sc = new Scanner(System.in);

    public static int[] findDiagonalOrder(List<List<Integer>> nums) {
        int m = nums.size();
        ArrayList<Integer> list = new ArrayList<>();
        if(m == 1){
            int[] ans = new int[nums.get(0).size()];
            for (int i = 0; i < nums.get(0).size(); i++) {
                ans[i] = nums.get(0).get(i);
            }
            return ans;
        }
        int n = -1;
        for (int i = 0; i < nums.size(); i++) {
            n = Math.max(n, nums.get(i).size());
        }
        if(n == 1){
            int[] ans = new int[nums.size()];
            for (int i = 0; i < nums.size(); i++) {
                ans[i] = nums.get(i).get(0);
            }
            return ans;
        }
        int map[][] = new int[m][n];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= nums.get(i).size()) {
                    map[i][j] = -1;
                } else {
                    map[i][j] = nums.get(i).get(j);
                }
            }
        }
        int half = (m - 1);
        int submax = m + n - 2 - half;
        System.out.println("half = " + half);
        System.out.println("submax = " + submax);
        System.out.println(Arrays.deepToString(map));
        int u = 0;
        for (int i = 0; i <= m + n - 2; i++) {
            System.out.println("i = " + i);
            if (i < half) {
                int max = i;
                if (i > submax) {
                    max = submax;
                }
                for (int j = i, k = 0; k <= max; j--, k++) {
                    System.out.println(j + " " + k);

                    if (map[j][k] >= 0) {
                        list.add(map[j][k]);
                    }
                }
            } else {
                for (int j = half, k = u; k <= submax; k++, j--) {
                    System.out.println(j + " " + k);
                    if(j < 0){
                        continue;
                    }
                    if (map[j][k] >= 0) {
                        list.add(map[j][k]);
                    }
                }
                u++;
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        List<List<Integer>> list = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("-1")) {
                break;
            }
            list.add(StrToArrlist(s));
        }
        //System.out.println(list);
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(findDiagonalOrder(list)));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static ArrayList<Integer> StrToArrlist(String w) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(w);
        String s[] = sb.toString().split("\\s+");
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