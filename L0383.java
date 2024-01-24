import java.util.*;

public class L0383 {
    final static Scanner sc = new Scanner(System.in);

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean boo = true;
        StringBuilder mag = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!mag.toString().contains(Character.toString(ransomNote.charAt(i)))) {
                boo = false;
                break;
            } else {
                mag.deleteCharAt(mag.indexOf(Character.toString(ransomNote.charAt(i))));

            }
        }
        return boo;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(canConstruct("a", "a"));
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