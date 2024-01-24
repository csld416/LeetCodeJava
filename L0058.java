import java.util.*;

public class L0058 {
    final static Scanner sc = new Scanner(System.in);

    public int lengthOfLastWord(String s) {
        String w[] = s.split("\\s+");
        return w[w.length - 1].length();
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}