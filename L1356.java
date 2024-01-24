import java.util.*;

public class L1356 {
    final static Scanner sc = new Scanner(System.in);


    public static class str {
        public int val;
        public String bitstr;

        str(int val, String bitstr) {
            this.val = val;
            this.bitstr = bitstr;
        }

        int getVal() {
            return this.val;
        }

        int getBitstr() {
            int count = 0;
            for (int i = 0; i < bitstr.length(); i++) {
                if (bitstr.charAt(i) == '1') {
                    count++;
                }
            }
            return count;
        }
    }

    public static int[] sortByBits(int[] arr) {
        str[] ans = new str[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = new str(arr[i], Integer.toBinaryString(arr[i]));
        }
        Arrays.sort(ans, Comparator.comparing(str::getBitstr)
                .thenComparing(str::getVal));

        int[] out = new int[arr.length];
        for (int i = 0; i < out.length; i++) {
            //System.out.println(ans[i].val + " : " + ans[i].bitstr);
            out[i] = ans[i].val;
        }
        return out;
    }


    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        String s = sc.nextLine();

        System.out.println(Arrays.toString(sortByBits(strtoarr(s))));

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    public static ArrayList<Integer> StrToArrlist(String w) {
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

    public static int[] strtoarr(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String w[] = sb.toString().split(",");
        int ans[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            ans[i] = Integer.parseInt(w[i]);
        }
        return ans;
    }

}

