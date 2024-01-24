import java.util.*;

public class L2125 {
    final static Scanner sc = new Scanner(System.in);

    public static int numberOfBeams(String[] bank) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < bank.length; i++) {
            sum = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                sum += bank[i].charAt(j) == '1' ? 1 : 0;
            }
            if (sum > 0) {
                list.add(sum);
            }
        }
        System.out.println(list);
        int ans = 0;
        for (int i = 0; i < list.size(); i += 1) {
            if(i == list.size()-1){
                break;
            }
            ans += list.get(i) * list.get(i+1);
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        String s[] = new String[]{"011001","000000","010100","001000"};

        long startTime = System.currentTimeMillis();
        System.out.println(numberOfBeams(s));
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