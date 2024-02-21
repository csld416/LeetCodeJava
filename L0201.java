import java.util.*;

public class L0201 {
    final static Scanner sc = new Scanner(System.in);

    public static int rangeBitwiseAnd(int left, int right) {
        StringBuilder s1 = new StringBuilder(Integer.toBinaryString(left));
        StringBuilder s2 = new StringBuilder(Integer.toBinaryString(right));

        while (true){
            if(s1.length() == 32){
                break;
            }
            s1.insert(0, '0');
        }
        while (true){
            if(s2.length() == 32){
                break;
            }
            s2.insert(0, '0');
        }
        if(s1.equals(s2)){
            return left;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        while (true){
            if(sb.length() == 32){
                break;
            }
            sb.append('0');
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println(rangeBitwiseAnd(5, 7 ));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}