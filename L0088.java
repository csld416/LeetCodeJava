import java.util.*;

public class L0088 {
    final static Scanner sc = new Scanner(System.in);

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while(m-- > 0){
            list.add(nums1[i]);
            i++;
        }
        i = 0;
        while(n-- > 0){
            list.add(nums2[i]);
            i++;
        }
        list.sort(null);
        for (int j = 0; j < nums1.length; j++) {
            nums1[j] = list.get(j);
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}