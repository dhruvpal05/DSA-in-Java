package Linkedlist;

import java.util.HashMap;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class RandomPointer {

        public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node,Node> old = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            Node node = new Node(temp.val);
            old.put(temp, node);
            temp=temp.next;
        }

        for (Node node : old.keySet()) {
            old.get(node).next = old.get(node.next);
            old.get(node).random = old.get(node.random);
        }

        return old.get(head);
    }
}