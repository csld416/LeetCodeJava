import java.util.*;

public class L0501 {

    final static Scanner sc = new Scanner(System.in);

    static ArrayList<Integer> ll(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String ss[] = sb.toString().split(",");
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < ss.length; i++) {
            if (isInteger(ss[i])) {
                ans.add(Integer.parseInt(ss[i]));
            }
        }
        return ans;
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

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

    public static int[] findMode(TreeNode root) {
        ans.clear();
        list.clear();
        inorderTraversal(root);
        Collections.sort(list);
        if (list.size() == 1) {
            ans.add(list.get(0));
        } else {
            int count = 1;
            int maxcount = 1;
            ans.add(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                if (Objects.equals(list.get(i), list.get(i - 1))) {
                    count++;
                    if (i == list.size() - 1) {
                        if (count > maxcount) {
                            maxcount = count;
                            ans.clear();
                            ans.add(list.get(i - 1));
                        }
                    }
                } else {
                    if (count > maxcount) {
                        maxcount = count;
                        ans.clear();
                        ans.add(list.get(i - 1));
                    } else if (count == maxcount && !ans.contains(list.get(i - 1))) {
                        ans.add(list.get(i - 1));
                    }
                    count = 1;
                }
                //System.out.println("index at " + i + ", count = " + count + ", maxount = " + maxcount);
            }
            int last = list.get(list.size() - 1);
            if (count == maxcount) {
                if (!ans.contains(last)) {
                    ans.add(last);
                }
            }
        }
        int res[] = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        Arrays.sort(res);
        return res;
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> ans = new ArrayList<>();

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] modes = findMode(root);
        System.out.println("Modes: " + Arrays.toString(modes));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}