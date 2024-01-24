import java.util.*;

public class L1457 {
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

    public static int pseudoPalindromicPaths(TreeNode root) {
        int[] cnt = new int[10];
        return dfs(root, cnt);
    }

    public static int dfs(TreeNode root, int[] cnt) {
        cnt[root.val]++;
        if (root.left == null && root.right == null) {
            System.out.println(Arrays.toString(cnt));
            int odd = 0;
            for (int i = 0; i < cnt.length; i++) {
                if (cnt[i] % 2 == 1) {
                    odd++;
                }
                if (odd > 1) {
                    return 0;
                }
            }
            return 1;
        }
        int a = 0, b = 0;
        if (root.left != null) {
            int[] arr = Arrays.copyOf(cnt, 10);
            a = dfs(root.left, arr);
        }
        if (root.right != null) {
            int[] arr = Arrays.copyOf(cnt, 10);
            b = dfs(root.right, arr);
        }
        return a + b;
    }

    public static void main(String[] args) throws Throwable {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        long startTime = System.currentTimeMillis();
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(pseudoPalindromicPaths(root));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}