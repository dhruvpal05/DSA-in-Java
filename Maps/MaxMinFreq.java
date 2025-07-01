package Maps;

import java.util.*;

public class MaxMinFreq {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(90));
    }

    public static int maxDifference1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) % 2 == 0) {
                maxEven = Math.max(maxEven, map.get(key));
                minEven = Math.min(minEven, map.get(key));
            } else {
                maxOdd = Math.max(maxOdd, map.get(key));
                minOdd = Math.min(minOdd, map.get(key));
            }
        }
        return Math.max(minOdd - maxEven, maxOdd - minEven);
    }

    public int maxDifference(String s, int k) {
        int i = 0;
        int j = i + k - 1;
        int n = s.length();
        while (j < n) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int l = i; l < j; l++) {

            }
        }
        return 0;
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
        }
        while (k-- > 0) {
            pq.poll();
        }
        return pq.peek();
    }

    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.diff, b.diff));
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            pq.add(new Pair(nums[i], nums[i + 1], Math.abs(nums[i] - nums[i + 1])));
        }
        if (p == 1) {
            return pq.poll().diff;
        }
        for (int i = 0; i < p - 1; i++) {
            pq.poll();
        }
        return pq.poll().diff;
    }

    public class Pair {
        int val1 = 0;
        int val2 = 0;
        int diff = 0;

        public Pair(int val1, int val2, int diff) {
            this.val1 = val1;
            this.val2 = val2;
            this.diff = diff;
        }

    }

    public static int minMaxDifference(int num) {
        String str = Integer.toString(num);
        int n = str.length();
        char[] strArr = str.toCharArray();
        char c = '9';
        for (char ch : strArr) {
            if (ch != '9') {
                c = ch;
                break;
            }
        }
        str = str.replace(c, '9');

        String str2 = Integer.toString(num);
        char ch = str2.charAt(0);
        str2 = str2.replace(ch, '0');
        System.out.println(str);
        System.out.println(str2);
        return Integer.parseInt(str) - Integer.parseInt(str2);
    }
}
