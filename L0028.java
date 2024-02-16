import java.util.*;

public class L0028 {
    final static Scanner sc = new Scanner(System.in);

    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (haystack.contains(needle)) {
            for (int i = 0; i <= haystack.length() - len; i++) {
                if (haystack.substring(i, i + len).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}