import java.util.*;

public class L0112 {
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


    List<Integer> list = new ArrayList<>();

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
           return false;
        }
        list.clear();
        add(root);
        return list.contains(targetSum);
    }

    public void add(TreeNode root) {
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        if (root.left != null) {
            root.left.val += root.val;
            add(root.left);
        }
        if (root.right != null) {
            root.right.val += root.val;
            add(root.right);
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}