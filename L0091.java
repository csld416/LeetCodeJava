import java.util.*;

public class L0091 {
    final static Scanner sc = new Scanner(System.in);

    public static int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int ans = 0;
        boolean haszero = false;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                haszero = true;
            }
            String s1 = s.charAt(i-1) + Character.toString(c);
            if(Integer.parseInt(s1) <= 26){
                if(s1.charAt(0) != '0'){
                    ans++;
                }else{
                    ans--;
                }
            }
        }
        if (!haszero) {
            ans++;
        }
        return ans;
    }

    public int numDecodings1(String s) {
        char lastDigit = s.charAt(0);
        if (lastDigit == '0') {
            return 0;
        }
        int tmp = 1, ans = 1;
        for (int i = 1; i < s.length(); i++) {
            char digit = s.charAt(i);
            int tempIndependentCount = digit == '0' ? 0 : ans, tempTotalNum = tempIndependentCount;
            if (lastDigit > '0' && lastDigit <= '2' && (lastDigit != '2' || digit <= '6')) {
                tempTotalNum += tmp;
            }
            lastDigit = digit;
            ans = tempTotalNum;
            tmp = tempIndependentCount;
            if (ans == 0) {
                return 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println(numDecodings("1123"));
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