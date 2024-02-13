import java.util.*;

public class L2108 {
    final static Scanner sc = new Scanner(System.in);

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPali(word)) {
                return word;
            }
        }
        return "";
    }

    public boolean isPali(String s) {
        for (int i = 0, j = s.length()-1; i < s.length() / 2; i++, j--) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}