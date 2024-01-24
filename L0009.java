import java.util.*;

public class L0009 {
    final static Scanner sc = new Scanner(System.in);

    public boolean isPalindrome(int x) {
        StringBuilder sb1 = new StringBuilder(Integer.toString(x));
        StringBuilder sb2 = new StringBuilder(Integer.toString(x));
        sb1.reverse();
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}