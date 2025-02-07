// package String;

import java.util.HashMap;
import java.util.Map;

public class MinCost {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
    long ans = 0;
    char[] src = source.toCharArray();
    char[] trg = target.toCharArray();

    Map<Character, Integer> costMap = new HashMap<>();
    for (int i = 0; i < original.length; i++) {
        costMap.put(original[i], cost[i]);
    }

    for (int i = 0; i < trg.length; i++) {
        if (src[i] != trg[i]) {
            if (costMap.containsKey(src[i])) {
                ans += costMap.get(src[i]);
                src[i] = trg[i]; 
            } else {
            }
        }
    }

    return ans;
}
}
