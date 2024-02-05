import java.util.*;

public class L0700 {
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

    List<TreeNode> list = new ArrayList<>();

    public void add(TreeNode root, int val) {
        if (root.val == val) {
            list.add(root);
        }
        if (root.left != null) {
            add(root.left, val);
        }
        if (root.right != null) {
            add(root.right, val);
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        add(root, val);
        return list.isEmpty() ? null : list.get(0);
    }


    public static void main(String[] args) throws Throwable {
        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}