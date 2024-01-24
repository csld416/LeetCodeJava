import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class L1630 {
    final static Scanner sc = new Scanner(System.in);

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Boolean> boo = new ArrayList<>();
        boolean b;
        for (int i = 0; i < l.length; i++) {
            list.clear();
            for (int j = l[i]; j <= r[i]; j++) {
                list.add(nums[j]);
            }
            Collections.sort(list);
            System.out.println(list);
            b = true;
            for (int j = 1; j < list.size()-1; j++) {
                if(list.get(j-1) + list.get(j+1) != list.get(j) * 2){
                    System.out.println(list.get(j));
                    b = false;
                    break;
                }
            }
            boo.add(b);
        }
        return boo;
    }

    public static void main(String[] args) throws Throwable {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println(checkArithmeticSubarrays(strtoarr(s1), strtoarr(s2), strtoarr(s3)));
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