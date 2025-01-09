package Stackandqueue;

class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if (top == -1) {
            arr[0] = x;
            top++;
        }else{
            arr[++top] = x;
        }
        
    }

    public int pop() {
        // Your Code
        if (top == -1) {
            return -1;
        }else{
            return arr[top--];
        }
    }
}
