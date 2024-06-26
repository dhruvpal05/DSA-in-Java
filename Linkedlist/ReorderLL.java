package Linkedlist;

public class ReorderLL {
    public class ListNode {
        int val;
        ListNode head;
        ListNode next;
        ListNode tail;

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

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
    
        ListNode mid = getMid(head);
        ListNode secondHalf = mid.next;
        mid.next = null; 
    
        ListNode tail = reverse2(secondHalf);
    
        ListNode first = head;
        ListNode second = tail;
    
        while (first != null && second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
    
            first.next = second;
            if (temp1 == null) break;
            second.next = temp1;
    
            first = temp1;
            second = temp2;
        }
    }
    
    public ListNode getMid(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
    
        return s;
    }
    
    public ListNode reverse2(ListNode node){
        ListNode prev = null;
        ListNode current = node;
    
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    
        return prev;
    }
    
}
