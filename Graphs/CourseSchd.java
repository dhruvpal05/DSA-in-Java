package Graphs;

import java.util.*;

public class CourseSchd {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        if (n == 0)
            return true;

        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
            graph[prerequisites[i][0]].add(prerequisites[i][1]);

        boolean[] vis = new boolean[numCourses];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                dfs(i, vis, stack, graph);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();
        while (!stack.isEmpty()) {
            topo.add(stack.pop());
        }

        if (topo.size() == numCourses) {
            return true;
        }
        return false;
    }

    private static void dfs(int node, boolean[] vis, Stack<Integer> stack, List<Integer>[] adj) {
        vis[node] = true;
        for (int neighbor : adj[node]) {
            if (!vis[neighbor]) {
                dfs(neighbor, vis, stack, adj);
            }
        }
        stack.push(node);
    }

    // private boolean dfs(int node, int[] visited, List<Integer> graph[]) {
    // if (visited[node] == 1)
    // return true;
    // if (visited[node] == -1)
    // return false;

    // visited[node] = -1;

    // for (int i = 0; i < graph[node].size(); i++) {
    // int neighbor = graph[node].get(i);
    // if (!dfs(neighbor, visited, graph))
    // return false;
    // }
    // visited[node] = 1;
    // return true;
    // }
}
