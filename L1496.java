import java.util.*;

public class L1496 {
    final static Scanner sc = new Scanner(System.in);

    public static boolean isPathCrossing(String path) {
        ArrayList<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{0, 0});
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'W'){
                x--;
            }
            if(path.charAt(i) == 'E'){
                x++;
            }
            if(path.charAt(i) == 'N'){
                y++;
            }
            if(path.charAt(i) == 'S'){
                y--;
            }
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j)[0] == x && list.get(j)[1] == y){
                    return true;
                }
            }
            list.add(new Integer[]{x, y});
        }
        return false;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("W : " + (int) 'W');
        System.out.println("N : " + (int) 'N');
        System.out.println("E : " + (int) 'E');
        System.out.println("S : " + (int) 'S');
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static ArrayList<Integer> StrToArrlist(String w) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(w);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String s[] = sb.toString().split(",");
        for (int i = 0; i < s.length; i++) {
            try {
                list.add(Integer.parseInt(s[i]));
            } catch (Exception e) {

            }
        }
        return list;
    }

    static int[] strtoarr(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String w[] = sb.toString().split(",");
        int arr[] = new int[w.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(w[i]);
        }
        return arr;
    }
}