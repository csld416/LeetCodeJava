import java.util.*;

public class L0344 {
    final static Scanner sc = new Scanner(System.in);

    public void reverseString(char[] s) {
        char tmp;
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}