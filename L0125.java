import java.util.*;

public class L0125 {
    final static Scanner sc = new Scanner(System.in);

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }
        for (int i = 0, j = sb.length()-1; i < sb.length() / 2; i++, j--) {
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Throwable {
        String s = "race a car";
        long startTime = System.currentTimeMillis();
        System.out.println(isPalindrome(s));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}