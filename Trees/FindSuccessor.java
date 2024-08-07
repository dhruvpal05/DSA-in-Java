import java.util.LinkedList;
import java.util.Queue;

/**
 * FindSuccessor
 */
public class FindSuccessor {

    public static TreeNode find(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if (currNode.left != null) {
                queue.offer(currNode.left);
            }
            if (currNode.right != null) {
                queue.offer(currNode.right);
            }
            if (currNode.val == target) {
                break;
            }
        }
        return queue.peek();
    }
}