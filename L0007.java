import java.util.*;

public class L0007 {
    final static Scanner sc = new Scanner(System.in);

    public int reverse(int x) {
        long n = x;
        boolean sign = x >= 0;
        if(n < 0){
            n *= -1;
        }
        StringBuilder sb = new StringBuilder(Long.toString(n));
        long n1 = Long.parseLong(sb.reverse().toString());
        if (n1 > Integer.MAX_VALUE) {
            return 0;
        } else {
            if(!sign){
                n1 *= -1;
            }
            return (int) n1;
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}