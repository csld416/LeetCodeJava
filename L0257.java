import java.util.*;

public class L0257 {
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

    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        list.clear();
        dfs(root, new StringBuilder());
        return list;
    }

    public void dfs(TreeNode root, StringBuilder sb){
        sb.append(root.val);
        if(root.left == null && root.right == null){
            list.add(sb.toString());
        }
        if(root.left != null){
            sb.append("->");
            StringBuilder sb1 = new StringBuilder(sb.toString());
            dfs(root.left, sb1);
        }
        if(root.right != null){
            sb.append("->");
            StringBuilder sb1 = new StringBuilder(sb.toString());
            dfs(root.right, sb1);
        }
    }


    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}