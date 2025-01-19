import java.util.ArrayList;

public class BT {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return helper(root, result);
    }

    private ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
        return list;
    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return helper(root, result);
    }

    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return helper(root, result);
    }
}
