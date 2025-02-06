import java.util.ArrayList;

import Searching.operators;

public class AllPaths {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        ArrayList<ArrayList<Integer>> ans = Paths(root);
        for (ArrayList<Integer> path : ans) {
            for (int i : path) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        ArrayList<Integer> path = new ArrayList<>();
        path.add(root.data);
        dfs(root, path, ans);
        return ans;
    }

    private static void dfs(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans) {
        if (root == null) {
            ans.add(path);
            return;
        }
        path.add(root.data);
        dfs(root.left, path, ans);
        path.remove(path.size() - 1);
        dfs(root.right, path, ans);
    }

}
