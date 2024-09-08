package Linkedlist;

public class SplitLL {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        ListNode ans[] = new ListNode[k];

        int eachsize = size / k;
        int remainingsize = size % k;
        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            ListNode newhead = current;
            int currentsize = eachsize;
            if (remainingsize > 0) {
                remainingsize--;
                currentsize++;
            }
            int j = 0;
            while (j < currentsize) {
                prev = current;
                current = current.next;
                j++;
            }
            if (prev != null) {
                prev.next = null;
            }
            ans[i] = newhead;
        }
        return ans;
    }
}
