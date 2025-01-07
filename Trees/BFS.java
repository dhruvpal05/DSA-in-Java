import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        
    }

    public static ArrayList<ArrayList<Integer>> printLevelWise(TreeNode root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            ArrayList<Integer> inner = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode currentNode = q.poll();
                inner.add(currentNode.val);
                if (currentNode.left != null) {
                    q.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.offer(currentNode.right);
                }
            }
            ans.add(inner);
        }
        return ans;
    }


    public static ArrayList<Integer> printElements(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            // ArrayList<Integer> inner = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode currentNode = q.poll();
                ans.add(currentNode.val);
                if (currentNode.left != null) {
                    q.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.offer(currentNode.right);
                }
            }
            // ans.add(inner);
        }
        return ans;
    }


    public static ArrayList<Integer> printLevel(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
    
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        list.add(root);  // Initialize with the root node
        int head = 0;    // Points to the current node to process
    
        while (head < list.size()) {
            TreeNode currentNode = list.get(head++);
            ans.add(currentNode.val);
            if (currentNode.left != null) {
                list.add(currentNode.left);
            }
            if (currentNode.right != null) {
                list.add(currentNode.right);
            }
        }
        return ans;
    }
    
}
