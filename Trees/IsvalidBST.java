public class IsvalidBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.left.val >= root.val) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.right.val <= root.val) {
                return false;
            }
        }

        if (!isValidBST(root.left)) {
            return false;
        }
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }
}
