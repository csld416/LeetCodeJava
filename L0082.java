import java.util.*;

public class L0082 {
    final static Scanner sc = new Scanner(System.in);

    public static class ListNode {
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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList<Integer> jail = new ArrayList<>();
        ListNode tmp = new ListNode(-1);
        ListNode ans = tmp;
        while (true) {
            if (head.next == null) {
                if (!jail.contains(head.val)) {
                    tmp.next = new ListNode(head.val);
                }
                break;
            } else {
                if (head.next.val == head.val) {
                    jail.add(head.val);
                    head = head.next;
                } else {
                    if (!jail.contains(head.val)) {
                        tmp.next = new ListNode(head.val);
                        head = head.next;
                        tmp = tmp.next;
                    } else {
                        head = head.next;
                    }
                }
            }
        }
        return ans.next;
    }

    public static void main(String[] args) throws Throwable {
        ListNode a = new ListNode(1);
        a.next = new ListNode(1);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(2);
        a.next.next.next.next = new ListNode(3);
        a.next.next.next.next.next = new ListNode(5);
        long startTime = System.currentTimeMillis();
        sout(deleteDuplicates(a));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

    static void sout(ListNode ls) {
        while (true) {
            if (ls == null) {
                break;
            } else {
                System.out.print(ls.val + " ");
                ls = ls.next;
            }
        }
        System.out.println();
    }
}