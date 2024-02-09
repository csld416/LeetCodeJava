import java.util.*;

public class L0190 {
    final static Scanner sc = new Scanner(System.in);

    public int reverseBits(int n) {
        int result = 0, i;
        for (i = 0; i < 32; i++) {
            result <<= 1;
            result = result | (n & 1);
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}