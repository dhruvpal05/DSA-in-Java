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
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>(levelSize);
            Deque<TreeNode> nextLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curTreeNode;
                if (leftToRight) {
                    curTreeNode = queue.pollFirst();
                    list.add(curTreeNode.val);
                    if (curTreeNode.left != null) {
                        nextLevel.addLast(curTreeNode);
                    }
                    if (curTreeNode.right != null) {
                        nextLevel.addLast(curTreeNode.right);
                    }
                } else {
                    curTreeNode = queue.pollLast();
                    list.add(curTreeNode.val);
                    if (curTreeNode.right != null) {
                        nextLevel.addFirst(curTreeNode.right);
                    }
                    if (curTreeNode.left != null) {
                        nextLevel.addFirst(curTreeNode.left);
                    }
                }
            }

            res.add(list);
            queue = nextLevel;
            leftToRight = !leftToRight;
        }

        return res;
    }
}
