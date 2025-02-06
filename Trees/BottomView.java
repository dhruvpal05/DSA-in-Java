import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {
    class Node {
        int data;
        int hd;
        Node left, right;

        public Node(int data) {
            this.data = data;
            hd = Integer.MAX_VALUE;
            left = right = null;
        }
    }

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        root.hd = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int hd = node.hd;
            map.put(hd, node.data);
            if (node.left != null) {
                node.left.hd = hd - 1;
                queue.offer(node.left);
            }
            if (node.right != null) {
                node.right.hd = hd + 1;
                queue.offer(node.right);
            }
        }
        for(int value : map.values()) {
            ans.add(value);
        }   
        return ans;
    }

    public class Pair {
        int hd;
        int value;

        public Pair(int hd, int value) {
            this.hd = hd;
            this.value = value;
        }
    }
}
