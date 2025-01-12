package Stackandqueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(34);
        stack.add(3);
        stack.add(31);
        stack.add(98);
        stack.add(92);
        stack.add(23);
        sortStack(stack);
        System.out.println(stack);
    }

    public static void sortStack(Stack<Integer> stack) {
        // Write your code here.
        if (stack.isEmpty()) {
            return;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while (!stack.isEmpty()) {
            pq.add(stack.pop());
        }
        while (!pq.isEmpty()) {
            stack.add(pq.poll());
        }
        return;
    }
}
