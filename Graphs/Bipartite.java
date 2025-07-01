package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {

    // DFS easy
    public boolean isBipartite1(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++)
            color[i] = -1;

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!dfs(i, graph, color, 0)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean dfs(int i, int[][] graph, int[] color, int col) {
        color[i] = col;

        for (int n : graph[i]) {
            if (color[n] == -1) {
                if (!dfs(n, graph, color, 1 - col)) {
                    return false;
                }
            } else if (color[n] == col) {
                return false;
            }
        }

        return true;
    }

    // BFS -->

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                color[i] = 0;

                while (!q.isEmpty()) {
                    int node = q.poll();

                    for (int it : graph[node]) {
                        if (color[it] == -1) {
                            q.offer(it);
                            color[it] = 1 - color[node];
                        } else if (color[it] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
