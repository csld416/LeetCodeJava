import java.util.*;

public class L0145 {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        list.clear();
        postorder(root);
        return list;
    }

    public void postorder(TreeNode root) {
        if (root != null) {
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            list.add(root.val);
        }
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}