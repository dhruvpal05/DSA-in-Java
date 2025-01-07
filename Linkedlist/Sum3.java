package Linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Sum3 {

    public static void main(String[] args) {
        
    }
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        ArrayList<ArrayList<Integer>>  ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        ans.add(new ArrayList<>(Arrays.asList(i, j, k)));
                    }
                }
            }
        }
        return ans;
    }
}