import java.util.*;

public class L0203 {
    final static Scanner sc = new Scanner(System.in);

    public class ListNode {
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

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            if (head.val != val) {
                list.add(head.val);
            }
            head = head.next;
        }
        if(list.isEmpty()){
            return null;
        }
        ListNode ans = new ListNode(list.get(0));
        ListNode tmp = ans;
        for (int i = 1; i < list.size(); i++) {
            tmp.next = new ListNode(list.get(i));
            tmp = tmp.next;
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}