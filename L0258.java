import java.util.*;

public class L0258 {
    final static Scanner sc = new Scanner(System.in);

    public int addDigits(int num) {
        String s = Integer.toString(num);
        if (s.length() == 1) {
            return num;
        } else {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += Integer.parseInt(Character.toString(s.charAt(i)));
            }
            return addDigits(sum);
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}