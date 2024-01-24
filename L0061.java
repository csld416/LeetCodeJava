import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class L0061 {
    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static OutputStreamWriter out = new OutputStreamWriter(System.out);

    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (k == 0) {
            return head;
        }
        int len = 1;
        ListNode count = head;
        while (count.next != null) {
            count = count.next;
            len++;
        }
        //===========================
        if (k > len) {
            k %= len;
        }
        if (k % len == 0) {
            return head;
        }
        if (len == 2 && k == 1) {
            ListNode tt = new ListNode(head.next.val);
            tt.next = new ListNode(head.val);
            return tt;
        }
        //===========================
        ListNode first = head;
        for (int i = 1; i <= len - k; i++) {
            first = first.next;
        }
        ListNode ans = first;
        //sout(first);
        while (first.next != null) {
            first = first.next;
        }
        for (int i = 1; i <= len - k; i++) {
            first.next = new ListNode(head.val);
            head = head.next;
            first = first.next;
        }
        return ans;
    }

    public static void sout(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            if (head.next != null) {
                head = head.next;
            } else {
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        ListNode ls = new ListNode(1);
        ls.next = new ListNode(2);
        //ls.next.next = new ListNode(2);
        //ls.next.next.next = new ListNode(4);
        //ls.next.next.next.next = new ListNode(5);
        ls = rotateRight(ls, 1);
        while (ls != null) {
            System.out.println(ls.val);
            ls = ls.next;
        }
        long endTime = System.currentTimeMillis();
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