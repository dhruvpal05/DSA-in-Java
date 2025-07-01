package Graphs;

import java.util.*;

public class MST {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        int res = 0;
        int[] vis = new int[V];
        for(int i=0;i<V;i++){
            vis[i] = -1;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int node = pair.node;
            int wt = pair.wt;
            if(vis[node] == 1) continue;
            vis[node] = 1;
            res += wt;
            for(int[] a : adj.get(node)){
                int newnode = a[0];
                int newwt = a[1];
                if (vis[newnode]==-1) {
                    pq.offer(new Pair(newnode, newwt));
                }
            }

        }
        return res;
    }

    public static class Pair {
        int node;
        int wt;
        public Pair(int node,int wt){
            this.node = node;
            this.wt = wt;
        }
    }
}
