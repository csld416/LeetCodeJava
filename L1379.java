import java.util.*;

public class L1379 {
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

    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        dfs(original, cloned, target);
        return ans;
    }

    public final void dfs(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original.val == target.val){
            ans = cloned;
        }
        if(original.left != null){
            getTargetCopy(original.left, cloned.left, target);
        }
        if(original.right != null){
            getTargetCopy(original.right, cloned.right, target);
        }
    }
    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}