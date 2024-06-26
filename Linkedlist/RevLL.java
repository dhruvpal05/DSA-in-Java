package Linkedlist;

import Arrays.takinginput;

public class RevLL {
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
        
        // recursion
        private void reverse(ListNode node){
            if(node == tail){
                head = tail;
                return;
            }
            reverse(node.next);
            tail.next = node;
            tail = node;
            tail.next = null;
    
        }
        // normal reversal
        private void reverse2(ListNode node){
            ListNode prev = null;
            ListNode current = node;

            while (current != null) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
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
    


    
}
