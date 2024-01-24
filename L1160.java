import java.util.*;

public class L1160 {
    final static Scanner sc = new Scanner(System.in);

    public static int countCharacters(String[] words, String chars) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            if (boo(words[i], chars)) {
                ans += words[i].length();
            }
        }
        return ans;
    }

    static boolean boo(String s, String dic) {
        int count[] = new int[122 + 1];
        for (int i = 0; i < dic.length(); i++) {
            count[dic.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]--;
        }
        for (int i = 97; i < 123; i++) {
            if(count[i] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println((int) 'a');
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