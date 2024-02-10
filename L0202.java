import java.util.*;

public class L0202 {
    final static Scanner sc = new Scanner(System.in);

    public static boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        if(n == 2){
            return false;
        }
        if(n == 4){
            return false;
        }
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        int a = 0;
        for (int i = 0; i < sb.length(); i++) {
            a += (int)Math.pow(Character.getNumericValue(sb.charAt(i)), 2);
        }
        return isHappy(a);
    }


    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println(isHappy(3));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}