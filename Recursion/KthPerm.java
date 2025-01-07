package Recursion;

public class KthPerm {
    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
    }

    static int count = 0; 

    public static String getPermutation(int n, int k) {
        StringBuilder s = new StringBuilder();
        StringBuilder result = new StringBuilder(); // Final result to hold the kth permutation
        
        for (int i = 1; i <= n; i++) {
            s.append(i);
        }
        
        helper(k, result, s);
        return result.toString();
    }
    
    private static void helper(int k, StringBuilder result, StringBuilder s) {
        if (s.isEmpty()) {
            count++;
            return;
        }
    
        for (int i = 0; i < s.length(); i++) {
            // Pick the current character
            char ch = s.charAt(i);
            result.append(ch); // Add the current character to the result
    
            // Create a new string without the chosen character
            StringBuilder newS = new StringBuilder(s.substring(0, i) + s.substring(i + 1));
            
            // Recurse
            helper(k, result, newS);
    
            if (count == k) return; // Stop recursion once the kth permutation is found
    
            // Backtrack: Remove the last added character
            result.deleteCharAt(result.length() - 1);
        }
    }
    
    ///                   123
        ///                  1/23
        ///          21/3             12/3
        /// 321   231   213        312   132   123
        /// 
        /// 
        /// 
        /// 
        /// 

}
