import java.util.*;

public class L0387 {
    final static Scanner sc = new Scanner(System.in);

    public int firstUniqChar(String s) {
        int cnt[] = new int[128];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(cnt[s.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}