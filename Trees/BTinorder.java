import java.util.ArrayList;
import java.util.List;

public class BTinorder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, result);
        result.add(node.val);
        inorderTraversal(node.right, result);
    }

    public int kthSmallest(TreeNode root, int k) {
        return helper(0,root,k);
    }

    private int helper(int i, TreeNode root, int k) {
        i++;
        if (i == k) {
            return root.val;
        }
        if (root == null) {
            return 0;
        }

        helper(i, root.left, k);
        helper(i, root, k);

        return 0;
    }
}
