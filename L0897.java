import java.util.*;

public class L0897 {
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

    public TreeNode increasingBST(TreeNode root) {
        list.clear();
        inorder(root);
        TreeNode ans = new TreeNode(list.get(0));
        list.remove(0);
        return add(ans);
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }

    public TreeNode add(TreeNode root) {
        if (!list.isEmpty()) {
            TreeNode tmp = new TreeNode(list.get(0));
            list.remove(0);
            root.right = add(tmp);
        }
        return root;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}