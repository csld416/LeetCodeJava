import java.util.*;

public class L0389 {
    final static Scanner sc = new Scanner(System.in);

    public char findTheDifference(String s, String t) {
        int cnt1[] = new int[128];
        int cnt2[] = new int[128];
        for(char c : s.toCharArray()){
            cnt1[c]++;
        }
        for(char c : t.toCharArray()){
            cnt2[c]++;
        }
        for (int i = 0; i < 128; i++) {
            if(cnt1[i] != cnt2[i]){
                return (char)i;
            }
        }
        return 'a';
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}