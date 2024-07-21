public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum == 0) {
            return true;
        }

        if (root == null && targetSum != 0) {
            return false;
        }
        targetSum -= root.val;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
