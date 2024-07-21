import java.util.LinkedList;
import java.util.Queue;

public class Flatten {
    Queue<TreeNode> queue = new LinkedList<>();

    public void flatten1(TreeNode root) {
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

    // optimized
    
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // Flatten the left and right subtrees
        flatten(root.left);
        flatten(root.right);

        // Store the left and right subtrees
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Set the left subtree to null and the right subtree to the flattened left
        // subtree
        root.left = null;
        root.right = left;

        // Find the end of the new right subtree and attach the flattened right subtree
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.right = right;
    }



}
