import java.util.*;

public class L1578 {
    final static Scanner sc = new Scanner(System.in);

    public static int minCost(String colors, int[] neededTime) {
        int ans = 0;
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                int j = i - 1;
                char c = colors.charAt(j);
                ArrayList<Integer> list = new ArrayList<>();
                list.add(neededTime[j]);
                j++;
                while (colors.charAt(j) == c) {
                    list.add(neededTime[j]);
                    if (j == colors.length() - 1) {
                        break;
                    } else {
                        j++;
                    }
                }
                i = j;
                Collections.sort(list);
                for (int k = 0; k < list.size() - 1; k++) {
                    ans += list.get(k);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(minCost("bbbaaa", new int[]{4, 9, 3, 8, 8, 9}));
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