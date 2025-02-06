import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        ArrayList<Integer> ans = topView(root);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        queue.offer(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            int hd = temp.index;
            Node node = temp.node;
            if (!map.containsKey(hd)) {
                map.put(hd, temp.node.data);
            }
            if (temp.node.left != null) {
                // temp.node.left.hd = hd - 1;
                queue.offer(new Pair(hd - 1, temp.node.left));
            }
            if (temp.node.right != null) {
                // temp.node.right.hd = hd + 1;
                queue.offer(new Pair(hd + 1, temp.node.right));
            }
        }

        for (int key : map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
    }

    static class Pair {
        int index;
        Node node;

        public Pair(int index, Node node) {
            this.index = index;
            this.node = node;
        }
    }
}
