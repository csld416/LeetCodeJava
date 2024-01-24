import java.util.*;

public class L0653 {
    final static Scanner sc = new Scanner(System.in);

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean findTarget(TreeNode root, int k) {
        if(root.left == null && root.right == null){
            return false;
        }
        inorder(root);
        if (list.get(list.size() - 1) + list.get(list.size() - 2) < k) {
            return false;
        }
        if (list.get(0) > k) {
            return false;
        }
        int j = list.size() - 1;
        if(k <= list.get(j)){
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i-1) < k && k < list.get(i)){
                    j = i;
                    break;
                }
                if(list.get(i) == k){
                    j = i-1;
                }
            }
        }
        while (j > -1) {
            k -= list.get(j);
            if (list.contains(k)) {
                return true;
            }
            j--;
        }
        //2 3 4 5 6 ->9
        return false;
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

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