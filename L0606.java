import apple.laf.JRSUIUtils;

import java.util.*;

public class L0606 {
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

    static StringBuilder sb = new StringBuilder();

    public static String tree2str(TreeNode root) {
        sb = new StringBuilder();
        preorder(root);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void preorder(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                sb.append("(");
                sb.append(root.val);
                sb.append(")");
            } else {
                sb.append("(");
                sb.append(root.val);
                if (root.left == null) {
                    sb.append("()");
                }
                preorder(root.left);
                preorder(root.right);
                sb.append(")");
            }
        }
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        long endTime = System.currentTimeMillis();
        System.out.println(tree2str(root));
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static ArrayList<Integer> StrToArrlist(String w) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(w);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String s[] = sb.toString().split(",");
        for (int i = 0; i < s.length; i++) {
            try {
                list.add(Integer.parseInt(s[i]));
            } catch (Exception e) {

            }
        }
        return list;
    }

    static int[] strtoarr(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String w[] = sb.toString().split(",");
        int arr[] = new int[w.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(w[i]);
        }
        return arr;
    }
}