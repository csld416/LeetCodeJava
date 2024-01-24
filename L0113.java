import java.util.*;

public class L0113 {
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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return new ArrayList<>();
        }
        list.clear();
        add(root, new ArrayList<>(), targetSum);
        return list;
    }
    public void add(TreeNode root, List<Integer> lis, int tar) {
        if (root.left == null && root.right == null) {
            if (tar - root.val == 0) {
                lis.add(root.val);
                list.add(lis);
            }
        } else {
            tar -= root.val;
            lis.add(root.val);
            if (root.left != null) {
                List<Integer> tmp = new ArrayList<>(lis);
                add(root.left, tmp, tar);
            }
            if (root.right != null) {
                List<Integer> tmp = new ArrayList<>(lis);
                add(root.right, tmp, tar);
            }
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}