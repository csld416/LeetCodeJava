import java.util.*;

public class L0062 {
    final static Scanner sc = new Scanner(System.in);

    public static int uniquePaths(int m, int n) {
        int map[][] = new int[m][n];
        Arrays.fill(map[0], 1);
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
        }
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length; j++) {
                map[i][j] = map[i][j-1] + map[i-1][j];
            }
        }
        return map[map.length-1][map[0].length-1];
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        System.out.println(uniquePaths(3, 7));

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static ArrayList<Integer> inp(String w) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(w);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String s[] = sb.toString().split(",");
        System.out.println(Arrays.toString(s));
        for (int i = 0; i < s.length; i++) {
            try {
                list.add(Integer.parseInt(s[i]));
            } catch (Exception e) {

            }
        }
        return list;
    }

}