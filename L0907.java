import java.util.*;

public class L0907 {
    final static Scanner sc = new Scanner(System.in);

    public static int sumSubarrayMins1(int[] arr) {
        int mod = (int) 1e9 + 7;
        int ans = 0;
        int i = 0, y = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int len = 1; len <= arr.length; len++) {
            for (int j = 0; j <= arr.length - len; j++) {
                y = len;
                i = j;
                list.clear();
                while (y-- > 0) {
                    list.add(arr[i]);
                    i++;
                }
                ans = (Collections.min(list) + ans) % mod;
            }
        }
        return ans;
    }

    public static int sumSubarrayMins(int[] arr) {
        int mod = (int) 1e9 + 7;
        int n = arr.length;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        long[] left = new long[n];
        long[] right = new long[n];

        // Calculate left boundaries
        for (int i = 0; i < n; ++i) {
            while (!s1.isEmpty() && arr[s1.peek()] > arr[i]) {
                s1.pop();
            }
            left[i] = s1.isEmpty() ? i + 1 : i - s1.peek();
            s1.push(i);
        }

        // Calculate right boundaries
        for (int i = n - 1; i >= 0; --i) {
            while (!s2.isEmpty() && arr[s2.peek()] >= arr[i]) {
                s2.pop();
            }
            right[i] = s2.isEmpty() ? n - i : s2.peek() - i;
            s2.push(i);
        }

        // Calculate the final sum
        long result = 0;
        for (int i = 0; i < n; ++i) {
            result = (result + arr[i] * left[i] * right[i]) % mod;
        }

        return (int) result;
    }

    /*1 2 3 4 5, len = 5
     * 1 2 3 4 5, 0 1 2 3 4
     * 12 23 34 45, 0 1 2 3
     * 123 234 345
     * 1234 2345
     * 12345
     * */
    public static void main(String[] args) throws Throwable {
        int arr[] = new int[]{3, 1, 2, 4};
        long startTime = System.currentTimeMillis();
        System.out.println(sumSubarrayMins(arr));
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