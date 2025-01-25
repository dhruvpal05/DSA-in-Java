import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                list.add(curr.data);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            ans.add(list.get(0));
        }
        return ans;
    }

    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        
        return ans;
    }

    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
}
