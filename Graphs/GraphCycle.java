package Graphs;

import java.util.*;

public class GraphCycle {
    public static void main(String[] args) {

    }

    public static boolean isCycle1(int[][] edges, int V) {
        int[] parent = new int[V];

        // Initially, each node is its own parent
        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            int pu = find(u, parent);
            int pv = find(v, parent);

            if (pu == pv) {
                // u and v are already in the same set → cycle detected
                return true;
            }

            // Union the sets
            parent[pu] = pv;
        }

        return false;
    }

    private static int find(int x, int[] parent) {
        if (parent[x] != x) {
            parent[x] = find(parent[x], parent); // path compression
        }
        return parent[x];
    }

    public static class Pair {
        int val;
        int parent;

        public Pair(int val, int prev) {
            this.val = val;
            this.parent = prev;
        }
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (dfs(i, -1, adj, vis)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                if (dfs(neighbor, node, adj, vis)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

}
