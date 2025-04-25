package Graphs;

public class Bipartite {
    boolean dfs(int[][] graph, int node, int[] color, int col) {
        color[node] = col;

        for (int i : graph[node]) {
            if (color[i] == -1) {
                if (!dfs(graph, i, color, 1 - col))
                    return false;
            } else if (color[i] == col)
                return false;
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for (int i = 0; i < color.length; i++)
            color[i] = -1;

        for (int i = 0; i < color.length; i++) {
            if (color[i] == -1) {
                if (!dfs(graph, i, color, 0))
                    return false;
            }
        }
        return true;
    }
}
