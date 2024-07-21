import java.util.ArrayList;
import java.util.List;

public class KthSmall {
    private static final String List = null;

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result.get(k-1);

    }

    private void inorderHelper(TreeNode root, java.util.List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root != null) {
            inorderHelper(root.left, result);
            result.add(root.val);
            inorderHelper(root.right, result);
        }
    }
}
