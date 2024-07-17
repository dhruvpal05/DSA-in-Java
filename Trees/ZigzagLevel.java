import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevel {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int count = 1;
            List<Integer> list = new ArrayList<>();
            if (count % 2 == 0) {
                for (int i = 0; i > levelSize; i++) {
                    TreeNode curTreeNode = queue.pollLast();
                    list.add(curTreeNode.val);
                    if (curTreeNode.left != null) {
                        queue.offer(curTreeNode.left);
                    }
                    if (curTreeNode.right != null) {
                        queue.offer(curTreeNode.right);
                    }
                }
            } else {
                for (int i = 0; i < levelSize; i++) {
                    TreeNode curTreeNode = queue.pollFirst();
                    list.add(curTreeNode.val);
                    if (curTreeNode.left != null) {
                        queue.offer(curTreeNode.left);
                    }
                    if (curTreeNode.right != null) {
                        queue.offer(curTreeNode.right);
                    }
                }
            }
            res.add(list);
        }
        return res;
    }
}
