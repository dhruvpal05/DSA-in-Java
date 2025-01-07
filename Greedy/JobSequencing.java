package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class JobSequencing {
    class Solution {
        public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
            int n = id.length;
            
            // Create a list of jobs with deadline and profit
            ArrayList<Job> jobs = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                jobs.add(new Job(id[i], deadline[i], profit[i]));
            }
    
            // Sort jobs by profit in descending order
            jobs.sort((a, b) -> Integer.compare(a.profit, b.profit));
    
            // Find the maximum deadline
            int maxDeadline = 0;
            for (Job job : jobs) {
                maxDeadline = Math.max(maxDeadline, job.deadline);
            }
    
            // Array to keep track of free time slots
            boolean[] slots = new boolean[maxDeadline + 1];
            int totalProfit = 0, tasksCompleted = 0;
    
            // Iterate through sorted jobs
            for (Job job : jobs) {
                // Find a free slot for this job (from its deadline backward)
                for (int j = Math.min(maxDeadline, job.deadline); j > 0; j--) {
                    if (!slots[j]) {
                        // Assign this job to the slot
                        slots[j] = true;
                        totalProfit += job.profit;
                        tasksCompleted++;
                        break;
                    }
                }
            }
    
            // Return the number of tasks completed and total profit
            return new ArrayList<>(Arrays.asList(tasksCompleted, totalProfit));
        }
    
        static class Job {
            int id, deadline, profit;
    
            Job(int id, int deadline, int profit) {
                this.id = id;
                this.deadline = deadline;
                this.profit = profit;
            }
        }
    }
}
