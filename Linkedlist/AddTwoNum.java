package Linkedlist;

public class AddTwoNum {
    public static void main(String[] args) {
        
    }
    public static long addTwoNumbers(ListNode l1, ListNode l2) {
        long n1 = 0;
        long n2 = 0;
        int i = 0;
        ListNode temp = l1;
        while (temp != null) {
            n1 += temp.val * Math.pow(10, i);
            temp = temp.next;
            i++;
        }
        i = 0;
        temp = l2;
        while (temp != null) {
            n2 += temp.val * Math.pow(10, i);
            temp = temp.next;
            i++;
        }
        return n1 + n2;
    }
}
