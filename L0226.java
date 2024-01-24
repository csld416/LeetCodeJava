import java.util.*;

public class L0226 {
    final static Scanner sc = new Scanner(System.in);

    public static class TreeNode {
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

    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }

    public void swap(TreeNode root) {
        if (root != null) {
            // Swap left and right child nodes
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            // Recursively swap left and right subtrees
            invertTree(root.left);
            invertTree(root.right);
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}