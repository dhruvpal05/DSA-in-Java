import java.util.ArrayList;

public class Postorder {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            ArrayList<Integer> result = new ArrayList<>();
            postorderTraversal(root, result);
            return result; // this works
        }

        private static void postorderTraversal(TreeNode node, ArrayList<Integer> result) {
            if (node == null) {
                return;
            }

            postorderTraversal(node.left, result);
            postorderTraversal(node.right, result);
            result.add(node.val);
        }
    }
}
