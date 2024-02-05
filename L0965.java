import java.util.*;

public class L0965 {
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

    public boolean isUnivalTree(TreeNode root) {
        list.clear();
        dfs(root);
        return Collections.max(list) == Collections.min(list);
    }

    public void dfs(TreeNode root){
        if(root != null){
           dfs(root.left);
           list.add(root.val);
           dfs(root.right);
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}