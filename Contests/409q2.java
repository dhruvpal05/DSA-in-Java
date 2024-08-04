package Contests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import Linkedlist.Cycle.ListNode;

public class 409q2 {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<int[]>> graph = new ArrayList<>();
        int[] answer = new int[queries.length];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            graph.get(i).add(new int[] { i + 1, 1 });
        }

        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            graph.get(u).add(new int[] { v, 1 });

            answer[i] = dijkstra(graph, n);
        }

        return answer;
    }

    private int dijkstra(List<List<int[]>> graph, int n) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        pq.add(new int[] { 0, 0 });

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int distance = current[1];

            if (distance > dist[node]) {
                continue;
            }

            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int newDist = distance + neighbor[1];

                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    pq.add(new int[] { nextNode, newDist });
                }
            }
        }

        return dist[n - 1];
    }

}
