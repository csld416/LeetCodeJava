import java.util.*;

public class L0023 {
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

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];
            if(node == null){
                continue;
            }
            while(node != null){
                list.add(node.val);
                node = node.next;
            }
        }
        if(list.isEmpty()){
            return null;
        }
        Collections.sort(list);
        ListNode tmp = new ListNode(list.get(0));
        ListNode ans = tmp;
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