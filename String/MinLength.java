import java.util.HashMap;

public class MinLength {
    public static void main(String[] args) {
        System.out.println(minimumLength("waoji"));
    }

    public static int minimumLength(String s) {
        int n = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean flag = true;
        for (char c : hashMap.keySet()) {
            if (hashMap.get(c) != 1) {
                flag = false;
            }
        }
        if (flag) {
            return n;
        }
        int ans = 0;
        for (char c : hashMap.keySet()) {
            if (hashMap.get(c) % 2 == 0) {
                ans += Math.ceilDiv(hashMap.get(c), 3);
            } else {
                ans += hashMap.get(c) / 3;
            }
        }
        return ans;
    }
}
