import java.util.*;

public class L0121 {
    final static Scanner sc = new Scanner(System.in);

    public static int maxProfit(int[] prices) {
        int max = 0, dt = 0;
        int min = Arrays.stream(prices).min().getAsInt();
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                dt = prices[j] - prices[i];
                max = Math.max(max, dt);
            }
            if (prices[i] == min) {
                return max;
            }
        }
        return max;
    }

    public static int maxProfit1(int[] prices) {
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            list.clear();
            for (int j = i; j < prices.length; j++) {
                list.add(prices[j]);
            }
            max = Math.max(max, Collections.max(list) - Collections.min(list));
        }
        return max;
    }

    public static void main(String[] args) throws Throwable {

        String s = sc.nextLine();
        ArrayList<Integer> list = inp(s);
        int arr[] = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        long startTime = System.currentTimeMillis();

        System.out.println(maxProfit(arr));
        System.out.println("length = " + arr.length);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    public static ArrayList<Integer> inp(String w) {
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
}