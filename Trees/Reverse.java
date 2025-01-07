import java.util.LinkedList;
import java.util.Queue;

public class Reverse {
    public static void main(String[] args) {
        
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                if (curr.left!=null) {
                    q.offer(curr.left);
                }
                if (curr.right!=null) {
                    q.offer(curr.right);
                }
                if(level%2!=0 && curr.left != null && curr.right!=null){
                    int temp = curr.left.val;
                    curr.left.val = curr.right.val;
                    curr.right.val = temp;
                }
            }
            level++;
        }
        return root;
    }
}
