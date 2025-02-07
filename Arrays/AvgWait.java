package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AvgWait {
    public static double averageWaitingTime(int[][] customers) {
        int start = customers[0][0];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < customers.length; i++) {
            start = start + customers[i][1];
            list.add(start-customers[i][0]);
        }
        int sum = 0; 
        for (int num : list) { 
            sum += num; 
        } 
        double average = (double)sum / list.size();
        return average;
    }
    public static void main(String[] args) {
        int[][] customers = {{1,2},{2,5},{4,3}};
        averageWaitingTime(customers);                          
    }
}
