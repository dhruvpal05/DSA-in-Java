package Linkedlist;

import Linkedlist.DupSortLL.ListNode;

public class MergeLL {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while (list1!=null || list2!=null) {
            if(temp1.val <= temp2.val){
                temp1.next = temp2;
                list1 = list1.next;
            }
            if (temp1.val > temp2.val) {
                temp2.next = temp1;
                list2 = list2.next;
            }
        }
        
    }
}
