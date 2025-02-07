package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        
    }
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        q.offer(0); 
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    q.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return ans;
    }
}
