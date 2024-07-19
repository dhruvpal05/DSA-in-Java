import java.util.LinkedList;
import java.util.Queue;

public class Flatten {
    Queue<TreeNode> queue = new LinkedList<>();

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrderTraversal(root);

        TreeNode current = queue.poll();
        while (current != null) {
            current.left = null;
            current.right = queue.peek();
            current = queue.poll();
        }
    }

    private void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        queue.add(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

}
