package Recursion;

import java.util.*;

public class SortArr {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

    }

    public static void sortArray(ArrayList<Integer> nums) {
        if (nums.size() <= 1) {
            return;
        }

        int temp = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        sortArray(nums);
        insert(nums, temp);
    }

    // Helper function to insert element in sorted order
    public static void insert(ArrayList<Integer> nums, int temp) {
        if (nums.size() == 0 || nums.get(nums.size() - 1) <= temp) {
            nums.add(temp);
            return;
        }
        int val = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        insert(nums, temp);
        nums.add(val);
    }

    public static void SortStack(Stack<Integer> stack) {
        if (stack.size() <= 1) {
            return;
        }

        int temp = stack.pop();
        SortStack(stack);
        insertInStack(stack, temp);
    }

    private static void insertInStack(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }

        int top = stack.pop();
        insertInStack(stack, temp);
        stack.push(top);
    }

}
