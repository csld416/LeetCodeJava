import java.util.*;

public class L1780 {
    final static Scanner sc = new Scanner(System.in);



    public boolean checkPowersOfThree(int n) {
        if(n == 1){
            return true;
        }
        int i = 0;
        while (true) {
            if ((int) Math.pow(3, i) > n) {
                break;
            }
            i++;
        }
        return checkPowersOfThree(n - (int) Math.pow(3, i));
    }

    // 1 3 9 27 81
    //83 -> 2
    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}