package String;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RevSubStg {
    public static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                Queue<Character> queue = new LinkedList<>();
                while (stack.peek() != '(') {
                    queue.add(stack.pop());
                }
                stack.pop(); // Remove the '('
                while (!queue.isEmpty()) {
                    stack.add(queue.remove());
                }
            } else {
                stack.add(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : stack) {
            ans.append(c);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        reverseParentheses("(b(du)a)");
    }

}
