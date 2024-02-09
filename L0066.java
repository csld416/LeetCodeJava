import java.util.*;

public class L0066 {
    final static Scanner sc = new Scanner(System.in);

    public static int[] plusOne(int[] digits) {
        int a1, a2;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            a.append(digits[i]);
        }
        a.reverse();
        StringBuilder b = new StringBuilder("1");
        while (b.length() < a.length()) {
            b.append(0);
        }
        int offset = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            a1 = Character.getNumericValue(a.charAt(i));
            a2 = Character.getNumericValue(b.charAt(i));
            System.out.printf("i = %d, a1 = %d, a2 = %d, offset = %d\n", i, a1, a2, offset);
            if (offset == 0) {
                if (a1 + a2 >= 10) {
                    sb.append((a1 + a2) % 10);
                    offset = 1;
                } else {
                    sb.append(a1 + a2);
                }
            } else {
                if (a1 + a2 + 1 >= 10) {
                    sb.append((a1 + a2 + 1) % 10);
                } else {
                    sb.append(a1 + a2 + 1);
                    offset = 0;
                }
            }
        }
        if (offset == 1) {
            sb.append(1);
        }
        sb.reverse();
        while (sb.charAt(0) == '0') {
            sb.delete(0, 1);
        }
        int arr[] = new int[sb.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(sb.charAt(i));
        }
        return arr;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(plusOne(new int[]{8, 9, 9})));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}