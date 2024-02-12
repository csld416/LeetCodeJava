import java.util.*;

public class L0118 {
    final static Scanner sc = new Scanner(System.in);

    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        if (numRows >= 1) {
            a.add(1);
            list.add(a);
            if (numRows >= 2) {
                b.add(1);
                b.add(1);
                list.add(b);
            }
        }
        if (numRows > 2) {
            for (int i = 3, n = 5; i <= numRows; i++, n += 2) {
                List<Integer> lis = new ArrayList<>();
                lis.add(1);
                for (int j = 1; j < list.get(i - 2).size(); j++) {
                    lis.add(list.get(i - 2).get(j) + list.get(i - 2).get(j - 1));
                }
                lis.add(1);
                list.add(lis);
            }
        }
        return list;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println(generate(4));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}