package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreq {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hp.containsKey(nums[i])) {
                hp.put(nums[i], hp.get(nums[i]) + 1);
            } else {
                hp.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> hp.get(o1) - hp.get(o2));
        for (Integer key : hp.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] op = new int[k];
        while (!minHeap.isEmpty()) {
            op[--k] = minHeap.poll();
        }
        return op;
    }
}
