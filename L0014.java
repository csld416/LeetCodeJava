import java.util.*;

public class L0014 {
    final static Scanner sc = new Scanner(System.in);

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            min = Math.min(min, str.length());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return sb.toString();
                } else {
                    if (j == strs.length - 1) {
                        sb.append(ch);
                    }
                }
            }
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