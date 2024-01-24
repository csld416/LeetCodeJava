import java.util.*;

public class L0101 {
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

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is symmetric
        }
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        // If both nodes are null, they are considered mirrors
        if (left == null && right == null) {
            return true;
        }
        // If one of the nodes is null and the other is not, they are not mirrors
        if (left == null || right == null) {
            return false;
        }
        // Check if the values are equal and if the subtrees are mirrors
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}