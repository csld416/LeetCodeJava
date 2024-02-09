import java.util.*;

public class L0067 {
    final static Scanner sc = new Scanner(System.in);

    public static String addBinary(String a, String b) {
        if(a.equals("0") && b.equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder a1 = new StringBuilder(a);
        StringBuilder a2 = new StringBuilder(b);
        if (a1.length() >= a2.length()) {
            while (a2.length() < a1.length()) {
                a2.insert(0, '0');
            }
        } else {
            while (a1.length() < a2.length()) {
                a1.insert(0, '0');
            }
        }
        a1.reverse();
        a2.reverse();
        int offset = 0;
        for (int i = 0; i < a2.length(); i++) {
            char aa = a1.charAt(i);
            char bb = a2.charAt(i);
            //System.out.printf("offset = %d, i = %d, aa = %c, bb = %c\n", offset, i, aa, bb);
            if (offset == 0) {
                if (aa + bb == 96) {
                    sb.append('0');
                }else if(aa + bb == 97){
                    sb.append('1');
                }else{
                    sb.append('0');
                    offset = 1;
                }
            }else{
                if (aa + bb == 96) {
                    sb.append('1');

                    offset = 0;
                }else if(aa + bb == 97){
                    sb.append('0');
                }else{
                    sb.append('1');
                }
            }
        }
        if(offset == 1){
            sb.append(1);
        }
        sb.reverse();
        while(sb.charAt(0) == '0'){
            sb.delete(0, 1);
        }
        return sb.toString();
    }


    public static void main(String[] args) throws Throwable {
        String s = "0";
        String b = "0";
        long startTime = System.currentTimeMillis();
        System.out.println(addBinary(s, b));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}