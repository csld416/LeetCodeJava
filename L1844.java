import java.util.*;

public class L1844 {
    final static Scanner sc = new Scanner(System.in);

    public String replaceDigits(String s) {
        char c;
        int shift;
        int n = s.length() % 2 == 0 ? s.length() : s.length() - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i += 2) {
            c = s.charAt(i);
            shift = Integer.parseInt(Character.toString(s.charAt(i + 1)));
            sb.append(c);
            sb.append((char) ((int) c + shift));
        }
        if (s.length() % 2 == 1) {
            sb.append(s.charAt(n));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}