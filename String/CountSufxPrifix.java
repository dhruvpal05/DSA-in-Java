public class CountSufxPrifix {
    public static void main(String[] args) {
        String[] words = { "a", "aba", "ababa", "aa" };
        System.out.println(countPrefixSuffixPairs(words));
        // System.out.println(words[]);
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (words[i].length() <= words[j].length()) {
                    String str1 = words[i];
                    String str2 = words[j];
                    if (str2.startsWith(str1) && str2.endsWith(str1)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
}
