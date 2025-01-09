package Stackandqueue;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    public MyQueue() {
        Stack first;
        Stack second;
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        if (!empty()) {
            while (first.size() > 1) {
                second.push(first.pop());
            }
            int ans = first.pop();
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return ans;
        }
        return -1;
    }

    public int peek() {
        if (!empty()) {
            while (first.size() > 1) {
                second.push(first.pop());
            }
            int ans = first.peek();
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return ans;
        }
        return -1;
    }

    public boolean empty() {
        // if (first.size()>0) {
        //     return false;
        // }
        // return true;
        if (first.isEmpty()) {
            return true;
        }
        return false;
    }
}
