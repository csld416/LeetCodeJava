import java.util.*;

public class L0405 {
    final static Scanner sc = new Scanner(System.in);

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        long val = num;
        if (num < 0) {
            val = (long) (Math.pow(2, 32) + num);
        }

        StringBuilder res = new StringBuilder();
        while (val != 0) {
            int remainder = (int) (val - (((int) (val / 16)) * 16));
            val = val / 16;
            if (remainder >= 10) {
                res.append((char) (remainder + 87));
            } else {
                res.append(remainder);
            }
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}