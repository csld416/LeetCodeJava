import java.util.*;

public class L1239 {
    final static Scanner sc = new Scanner(System.in);

    public static int maxLength(List<String> arr) {
        return backtrack(0, arr, "");
    }

    private static int backtrack(int index, List<String> arr, String curr) {
        int maxLength = isUni(curr) ? curr.length() : 0;
        for (int i = index; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, backtrack(i + 1, arr, curr + arr.get(i)));
        }
        return maxLength;
    }

    private static boolean isUni(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}