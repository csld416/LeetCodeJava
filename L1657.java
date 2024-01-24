import java.util.*;

public class L1657 {
    final static Scanner sc = new Scanner(System.in);

    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        int cnt1[] = new int[128];
        int cnt2[] = new int[128];
        for (int i = 0; i < word1.length(); i++) {
            cnt1[word1.charAt(i)]++;
        }
        for (int i = 0; i < word2.length(); i++) {
            cnt2[word2.charAt(i)]++;
        }
        for (int i = 0; i < 128; i++) {
            if ((cnt1[i] == 0 && cnt2[i] != 0) || (cnt1[i] != 0 && cnt2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(cnt1);
        Arrays.sort(cnt2);
        return Arrays.equals(cnt1, cnt2);
    }

    /*
    aa bbb c, a bb ccc
    bb aaa c
    bb ccc a
    2 3 1, 1 2 3

    * */

    public static void main(String[] args) throws Throwable {
        String a = "abc";
        String b = "cba";
        long startTime = System.currentTimeMillis();
        System.out.println(closeStrings(a, b));
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