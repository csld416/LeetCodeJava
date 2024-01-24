import java.util.*;

public class L2413 {
    final static Scanner sc = new Scanner(System.in);

    public int smallestEvenMultiple(int n) {
        return n * 2 / gcd(n, 2);
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}