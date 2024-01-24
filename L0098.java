import java.util.*;

public class L0098 {
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

    public static boolean isValidBST1(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST1(root.left) && isValidBST1(root.right)) {
            if (root.left == null && root.right == null) {
                return true;
            }
            if (root.left == null) {
                if (root.right.val <= root.val) {
                    return false;
                }
                return true;
            }
            if (root.right == null) {
                if (root.left.val >= root.val) {
                    return false;
                }
                return true;
            }
            if (root.right.val > root.val && root.left.val < root.val) {
                return true;
            }
            System.out.println("hello");
        }
        return false;
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }

    public static boolean isValidBST(TreeNode root) {
        list.clear();
        inorder(root);
        if (list.size() == 1) {
            return true;
        }
        ArrayList<Integer> b = new ArrayList<>();
        b.addAll(list);
        Collections.sort(b);
        if (b.equals(list)) {
            for (int i = 1; i < list.size(); i++) {
                if (Objects.equals(b.get(i), b.get(i - 1))) {
                    return false;
                }
            }
            return true;
        }
        System.out.println(list);
        return false;
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        TreeNode tree = new TreeNode(0);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);
        System.out.println(isValidBST(tree));

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }
}