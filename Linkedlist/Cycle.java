package Linkedlist;

public class Cycle {
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
    public int hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        

        while(fast != null && slow != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                int count=0;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    count++;
                } while (temp!=slow);
                return count;
            }
        }

        return 0;
    }
}
