import java.util.*;

public class L0119 {
    final static Scanner sc = new Scanner(System.in);

    static List<List<Integer>> list = new ArrayList<>();
    public static void add() {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        list.add(a);
        b.add(1);
        b.add(1);
        list.add(b);
        for (int i = 3, n = 5; i <= 34; i++, n += 2) {
            List<Integer> lis = new ArrayList<>();
            lis.add(1);
            for (int j = 1; j < list.get(i - 2).size(); j++) {
                lis.add(list.get(i - 2).get(j) + list.get(i - 2).get(j - 1));
            }
            lis.add(1);
            list.add(lis);
        }
    }
    public static List<Integer> getRow(int numRows) {
        return list.get(numRows);
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}