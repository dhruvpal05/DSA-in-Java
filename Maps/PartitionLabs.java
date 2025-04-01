import java.util.HashMap;
import java.util.List;

public class PartitionLabs {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int z = 1;
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, z++);
            } else {
                map.put(c, z++);
            }
        }
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < n) {
            end = Math.max(end, map.get(s.charAt(i)));
            if (i == end) {
                res.add(end - start + 1);
                start = end + 1;
            }
            i++;
        }
        return res;
    }
}
