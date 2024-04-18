import java.util.*;

public class L0205 {
    final static Scanner sc = new Scanner(System.in);

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int cnta[] = new int[128];
        int cntb[] = new int[128];
        for (char c : s.toCharArray()) {
            cnta[c]++;
        }
        for(char c : t.toCharArray()){
            cntb[c]++;
        }
        Arrays.sort(cnta);
        Arrays.sort(cntb);
        return Arrays.equals(cnta, cntb);
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}