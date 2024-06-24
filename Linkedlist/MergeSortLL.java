package Linkedlist;

import pakages.literals;

/**
 * MergeSortLL
 */
public class MergeSortLL {
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

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeList(left, right);
    }

    public ListNode getMid(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode mergeList(ListNode list1, ListNode list2){
        ListNode ans = null;
        if(list1 == null){
            return list2;
        }else if (list2 == null) {
            return list1;
        }
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ans.next = list1;
                list1 = list1.next;
            }else{
                ans.next = list2;
                list2 = list2.next;
            }
        }
        return ans;
    }

     
}