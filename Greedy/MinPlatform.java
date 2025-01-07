package Greedy;

import java.util.PriorityQueue;

import Searching.string;

public class MinPlatform {
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int n = arr.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((p,q)-> Integer.compare(p.arr, q.arr));
        for(int i=0;i<n;i++){
            pq.add(new Pair(arr[i], dep[i]));
        }
        int max = 1;
        int start = pq.peek().arr;
        int end = pq.peek().dep;
        pq.poll();

        for(int i=1;i<n;i++){
            int curplat = 1;
            int curstart = pq.peek().arr;
            int currend = pq.peek().dep;
            if(curstart<end){
                curplat++;
            }else{
                curplat--;
                end = currend;
            }
            max = Math.max(max, curplat);
            pq.poll();
        }
        return max;
    }

    // arr[] = [900, 940, 950, 1100, 1500, 1800], dep[] = [910, 1200, 1120, 1130, 1900, 2000]
    public static class Pair {
        int arr;
        int dep;

        public Pair(int arr,int dep){
            this.arr =arr;
            this.dep=dep;
        }
        
    }
}
