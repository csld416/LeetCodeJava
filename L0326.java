import java.util.*;

public class L0326 {
    final static Scanner sc = new Scanner(System.in);

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        double d = n;
        while (d > 0) {
            if (d == 1) {
                return true;
            }
            d /= (3 * 1.0);
            if (d != (int) d) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}