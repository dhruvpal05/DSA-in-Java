package Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import Arrays.takinginput;

public class FractionalKnapsach {

    public static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        int n = val.size();
        double ans = 0.0;

        // Priority Queue to store items by their worth (value-to-weight ratio) in descending order
        PriorityQueue<KnapsackItem> pq = new PriorityQueue<>((p, q) -> Double.compare(q.worth, p.worth));

        // Add items to the priority queue
        for (int i = 0; i < n; i++) {
            double worth = (double) val.get(i) / wt.get(i);
            pq.add(new KnapsackItem(val.get(i), wt.get(i), worth));
        }

        // Process the items
        while (!pq.isEmpty() && capacity > 0) {
            KnapsackItem item = pq.poll(); // Get the item with the highest worth
            if (item.weight <= capacity) {
                // Take the full item
                capacity -= item.weight;
                ans += item.value;
            } else {
                // Take the fraction of the item
                ans += item.worth * capacity;
                capacity = 0;
            }
        }

        return ans;
    }

    // Helper class to represent a knapsack item
    static class KnapsackItem {
        int value, weight;
        double worth;

        public KnapsackItem(int value, int weight, double worth) {
            this.value = value;
            this.weight = weight;
            this.worth = worth;
        }
    }

}
