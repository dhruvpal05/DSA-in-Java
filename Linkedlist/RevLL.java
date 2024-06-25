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
    }
    


    
}
