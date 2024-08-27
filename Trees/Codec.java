import java.util.ArrayList;
import java.util.List;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        List<Integer> list = new ArrayList<Integer>();
        helper(root,list);
        return list.toString();
    }

    private void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode node = new TreeNode();
        return node;
    }
}
