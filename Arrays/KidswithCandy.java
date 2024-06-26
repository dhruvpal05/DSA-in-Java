package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidswithCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies =0; // maximum candies is initialised as 0
        for(int candy: candies){ // loop is initiated to traverse the loop to get the highest element
            maxCandies = Math.max(candy,maxCandies); // finding out the largest element among the given array list

        }
        List<Boolean>result = new ArrayList<>(); // creating an empty list for the output
        for(int candy : candies){ // same loop is initiated
            result.add(candy + extraCandies >= maxCandies); // true/false value is appended to the list according to the condidtion mentioned
        }
        return result; // output as list of boolean answers is given
    }
}
