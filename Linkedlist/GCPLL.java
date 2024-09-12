package Linkedlist;

public class GCPLL {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            int value = fun(temp.val, temp.next.val);
            ListNode n = new ListNode(value);
            n.next = temp.next;
            temp.next = n;
        }
        return head;
    }

    private int fun(int a, int b) {
        if(a == 0 || b == 0) return a+b; // base case
        return fun(b,a%b);
    }
}
