import java.util.*;

public class L2391 {
    final static Scanner sc = new Scanner(System.in);

    public static int garbageCollection(String[] garbage, int[] travel) {
        int[] sum = new int[garbage.length];
        sum[0] = 0;
        for (int i = 1; i < garbage.length; i++) {
            sum[i] = sum[i-1] + travel[i-1];
        }
        int ans = 0;
        int m = 0, p = 0, g = 0;
        for (int i = 0; i < garbage.length; i++) {
            for (int j = 0; j < garbage[i].length(); j++) {
                if(garbage[i].charAt(j) == 'M'){
                    ans++;
                    m = Math.max(m, i);
                }else if(garbage[i].charAt(j) == 'P'){
                    ans++;
                    p = Math.max(p, i);
                }else if(garbage[i].charAt(j) == 'G'){
                    ans++;
                    g = Math.max(g, i);
                }
            }
        }
        ans += sum[m] + sum[p] + sum[g];
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(garbageCollection(new String[]{"G","P","GP","GG"}, new int[]{2, 4, 3}));
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
    static int[] strtoarr(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        String w[] = sb.toString().split(",");
        int arr[] = new int[w.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(w[i]);
        }
        return arr;
    }
}