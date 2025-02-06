import java.util.ArrayList;
import java.util.List;

public class InPrePost {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    };

    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        inOrderTraversal(root, inOrder);
        preOrderTraversal(root, preOrder);
        postOrderTraversal(root, postOrder);
        ans.add(inOrder);
        ans.add(preOrder);
        ans.add(postOrder);
        return ans;
    }

    private static void postOrderTraversal(TreeNode root, List<Integer> postOrder) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left, postOrder);
        postOrderTraversal(root.right, postOrder);
        postOrder.add(root.data);
    }

    private static void preOrderTraversal(TreeNode root, List<Integer> preOrder) {
        if (root == null) {
            return;
        }
        preOrder.add(root.data);
        preOrderTraversal(root.left, preOrder);
        preOrderTraversal(root.right, preOrder);
    }

    private static void inOrderTraversal(TreeNode root, List<Integer> inOrder) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, inOrder);
        inOrder.add(root.data);
        inOrderTraversal(root.right, inOrder);
    }
}
