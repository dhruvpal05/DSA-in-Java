package Stackandqueue;

import java.util.Stack;

/**
 * MaxGain
 */
public class MaxGain {

    public int maximumGain(String s, int x, int y) {
        // Initialize stack to store characters
        Stack<Character> stack = new Stack<>();
        int gain = 0;
        int maxGain = 0;

        // Determine order of characters based on x and y values
        char first = (x > y) ? 'a' : 'b';
        char second = (x > y) ? 'b' : 'a';
        int pointsFirst = (x > y) ? x : y;
        int pointsSecond = (x > y) ? y : x;

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if current character combined with top of stack forms "ab" or "ba"
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                // Calculate gain and pop from stack
                gain += pointsFirst;
                stack.pop();
                maxGain = Math.max(maxGain, gain); // Track maximum gain
            } else {
                // Push current character to stack
                stack.push(c);
            }
        }

        // Calculate remaining gains for characters left in stack
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (!stack.isEmpty() && top == first && stack.peek() == second) {
                gain += pointsSecond;
                stack.pop(); // Pop the second character from stack
                maxGain = Math.max(maxGain, gain); // Track maximum gain
            }
        }

        return maxGain;
    }
}