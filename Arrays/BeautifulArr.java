package Arrays;

public class BeautifulArr {
    class Solution {
        public int countArrangement(int n) {
            boolean[] visited = new boolean[n + 1];
            return count(1, n, visited);
        }

        private int count(int pos, int n, boolean[] visited) {
            if (pos > n) {
                return 1;
            }

            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && (i % pos == 0 || pos % i == 0)) {
                    visited[i] = true;
                    ans += count(pos + 1, n, visited);
                    visited[i] = false; // backtrack
                }
            }

            return ans;
        }
    }

}
