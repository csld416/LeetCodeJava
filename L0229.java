import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L0229 {

    final static Scanner sc = new Scanner(System.in);

    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length / 3;
        int tmp = nums[0], count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > tmp) {
                tmp = nums[i];
                count = 0;
            }
            count++;
            if (count > n) {
                if(list.size() == 0){
                    list.add(nums[i]);
                }else if (list.get(list.size() - 1) != nums[i]){
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) throws Throwable {
        int nums[] = {1, 1, 1, 2, 4, 4, 4, 4, 4};
        //int nums[] = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
}
