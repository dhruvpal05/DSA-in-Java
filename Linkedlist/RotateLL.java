package Linkedlist;

public class RotateLL {
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

    public int getLength(ListNode head) {
		ListNode node = head;
		int length = 0;
		while (node != null) {
			length++;
			node = node.next;
		}
		return length;
	}

    public ListNode rotateRight(ListNode head, int k) {
        int length = getLength(head);
        ListNode temp = head;
        for (int i = 1; i < length - k; i++) {
            temp = temp.next;
        }
        ListNode last = temp;
        ListNode newHead = temp.next;

        temp.next = null;
        while (last != null && last.next != null) {
            last = last.next;
        }
        last.next = head;

        return newHead;

    }
}
