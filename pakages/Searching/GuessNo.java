package Searching;

public class GuessNo {
    public int guessNumber(int n) {
        int mid = -1;
        int start = 0;
        int end = n;
        while (start<=end) {
            mid = start + (end - start)/2;
            int guess = guess(mid); //predefined
            if(guess == 0){
                return mid;
            }else if(guess == 1){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return mid;
    }
}
