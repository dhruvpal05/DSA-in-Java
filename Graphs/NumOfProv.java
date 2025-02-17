package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumOfProv {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                BFS(i, isConnected, visited);
            }
        }
        return count;
    }

    private void BFS(int i, int[][] isConnected, boolean[] visited) {
        visited[i] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int j = 0; j < visited.length; j++) {
                if (!visited[i] && isConnected[curr][j] == 1) {
                    visited[j] =  true;
                    queue.offer(j);
                }
            }
        }
    }
}
