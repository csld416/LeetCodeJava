import java.util.ArrayList;
import java.util.Scanner;

public class L0343 {

    final static Scanner sc = new Scanner(System.in);

    static int pow(int a, int b){
        return (int)Math.pow(a, b);
    }

    static int integerBreak(int n) {
        int arr[] = {1, 2, 4, 6, 9, 12, 18, 27};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        for(int i = 10; i <= n; i++){
            list.add(3* list.get(i-3-2));
        }
        return list.get(n-2);
    }

    public static void main(String[] args) throws Throwable {
        System.out.println(integerBreak(58));
    }
}
