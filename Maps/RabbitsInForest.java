package Maps;

import java.util.HashMap;

public class RabbitsInForest {
    public int numRabbits(int[] answers) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : answers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) <= key + 1) {
                ans += key + 1;
            } else {
                int val = map.get(key);
                int groups = (val + key) / (key + 1);
                ans += groups * (key + 1);

            }
        }
        return ans;
    }
}
