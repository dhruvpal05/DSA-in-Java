import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrder {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, root));

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int idx = curr.index;
            TreeNode node = curr.node;

            // Ensure list exists before adding values
            map.putIfAbsent(idx, new ArrayList<>());
            map.get(idx).add(node.val);

            // Add children to queue
            if (node.left != null)
                queue.offer(new Pair(idx - 1, node.left));
            if (node.right != null)
                queue.offer(new Pair(idx + 1, node.right));
        }

        // Convert TreeMap values to List<List<Integer>>
        for (List<Integer> group : map.values()) {
            ans.add(group);
        }

        return ans;
    }

    class Pair {
        int index;
        TreeNode node;

        Pair(int index, TreeNode node) {
            this.index = index;
            this.node = node;
        }
    }
}
