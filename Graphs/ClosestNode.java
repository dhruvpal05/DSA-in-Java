package Graphs;

import java.util.Arrays;

// import pakages.again;

public class ClosestNode {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        Arrays.fill(dist1, -1);
        int[] dist2 = new int[n];
        Arrays.fill(dist2, -1);

        dfs(edges, dist1, node1);
        dfs(edges, dist2, node2);

        int minDist = Integer.MAX_VALUE;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                int maxDist = Math.max(dist1[i], dist2[i]);
                if (maxDist < minDist) {
                    minDist = maxDist;
                    ans = i;
                }
            }
        }

        return ans;
    }

    private void dfs(int[] edges, int[] dist, int start) {
        boolean[] visited = new boolean[edges.length];
        int distance = 0;
        int node = start;

        while (node != -1 && !visited[node]) {
            dist[node] = distance;
            visited[node] = true;
            node = edges[node];
            distance++;
        }
    }

}
