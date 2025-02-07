// package String;

public class MinDel {
    public int minimumDeletions(String s) {
        int countB = 0; // Count of 'b' encountered
        int deletions = 0; // Number of deletions needed
    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                countB++;
            } else if (s.charAt(i) == 'a') {
                if (countB > 0) {
                    deletions++;
                    countB--; // Removing a 'b' is equivalent to converting it to an 'a'
                }
            }
        }
    
        return deletions;
    }
    
}
