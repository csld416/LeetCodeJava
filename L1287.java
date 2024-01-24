import java.util.*;

public class L1287 {
    final static Scanner sc = new Scanner(System.in);

    public static int findSpecialInteger(int[] arr) {
        int cri = arr.length/4;
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                count++;
                if(count > cri){
                    return arr[i];
                }
            }else{
                count = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        int arr[] = new int[]{1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
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
    static int[] strtoarr(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        String w[] = sb.toString().split(",");
        int arr[] = new int[w.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(w[i]);
        }
        return arr;
    }
}