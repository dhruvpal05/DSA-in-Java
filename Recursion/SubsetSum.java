package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {
    // public ArrayList<Integer> subsetSums(int[] arr) {
    //     // code here
    //     int n = arr.length;
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     return helper(n-1,arr,ans);
    //         }
        
    //         private ArrayList<Integer> helper(int i, int[] arr, ArrayList<Integer> ans) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'helper'");
    //         }

    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        calculateSubsetSums(0, 0, arr, ans);
        return ans;
    }

    // Helper function to calculate subset sums using recursion
    private static void calculateSubsetSums(int index, int currentSum, int[] arr, ArrayList<Integer> ans) {
        if (index == arr.length) {
            ans.add(currentSum);
            return;
        }

        // Include the current element in the subset
        calculateSubsetSums(index + 1, currentSum + arr[index], arr, ans);

        // Exclude the current element from the subset
        calculateSubsetSums(index + 1, currentSum, arr, ans);
    }

    public static void main(String[] args) {
        int[] arr = {2,3};
        System.out.println(subsetSums(arr));
    }
}
