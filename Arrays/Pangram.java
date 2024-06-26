package Arrays;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<=26){
            return false;
        }
        int arr[]= new int[26];

        for(int i=0;i<sentence.length();i++)
            arr[sentence.charAt(i)-'a']++;

        for(int i=0;i<26;i++)
            if(arr[i]< 1)
                return false;
        
        return true;
    }
}
