package Linkedlist;

/**
 * MergeNodes
 */
public class MergeNodes {
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

    class Solution {
        public ListNode mergeNodes(ListNode head) {
            ListNode temp = head.next;
            ListNode dummy = head;
            
            while (temp != null) {
                int sum = 0;
                
                // Sum values until the next zero node
                while (temp != null && temp.val != 0) {
                    sum += temp.val;
                    temp = temp.next;
                }
                
                // Set the sum to the current node
                dummy.val = sum;
                
                // Move dummy to the next node
                dummy.next = temp.next;
                dummy = dummy.next;
                
                // Move temp to the next node
                if (temp != null) {
                    temp = temp.next;
                }
            }
            
            return head;
        }
    }
    
    private void ListNode(int val, ListNode next) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ListNode'");
    }
    
}