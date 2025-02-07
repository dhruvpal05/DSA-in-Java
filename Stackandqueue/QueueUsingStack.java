package Stackandqueue;

import java.util.Stack;

public class QueueUsingStack {
    class MyQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            if (stack1.isEmpty()) {
                stack2.push(x);
            } else {
                stack1.push(x);
            }
        }

        public int pop() {
            if (stack1.isEmpty()) {
                while (stack2.size() > 1) {
                    stack1.push(stack2.pop());
                }
                return stack2.pop();
            } else {
                while (stack1.size() > 1) {
                    stack2.push(stack1.pop());
                }
                return stack1.pop();
            }
        }

        public int peek() {
            if (stack1.isEmpty()) {
                while (stack2.size() > 1) {
                    stack1.push(stack2.pop());
                }
                int res = stack2.peek();
                while (stack1.isEmpty()) {

                }
            } else {
                while (stack1.size() > 1) {
                    stack2.push(stack1.pop());
                }
                return stack1.pop();
            }
            return 0;
        }

        public boolean empty() {
            return false;

        }
    }
    // <-[]<- Queue
    // []<--> stack
    //
    //
    //
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
