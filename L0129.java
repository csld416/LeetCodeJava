import java.util.*;

public class L0129 {
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

    List<StringBuilder> list = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        list.clear();
        add(root, new StringBuilder());
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            ans += Integer.parseInt(list.get(i).toString());
        }
        return ans;
    }

    public void add(TreeNode root, StringBuilder sb) {
        sb.append(root.val);
        if(root.left == null && root.right == null){
            list.add(sb);
        }
        if(root.left != null){
            StringBuilder left = new StringBuilder(sb.toString());
            add(root.left, left);
        }
        if(root.right != null){
            StringBuilder right = new StringBuilder(sb.toString());
            add(root.right, right);
        }
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}