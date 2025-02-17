package Graphs;

import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = adj.size();
        boolean[] visited = new boolean[n];
        // visited[0] = true;
        dfs(0, visited, adj, ans);
        return ans;
    }

    private void dfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        visited[i] = true;
        ans.add(i);
        ArrayList<Integer> list = adj.get(i);
        for(int l : list){
            if (visited[l]) {
                dfs(l, visited, adj, ans);
            }
        }
    }
}
