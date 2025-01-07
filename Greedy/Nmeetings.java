package Greedy;
import java.util.*;

public class Nmeetings {
    public int maxMeetings(int start[], int end[]) {
        int n = start.length;
        PriorityQueue<Node> pq = new PriorityQueue<>((p1,p2)->Integer.compare(p1.end, p2.end));
        for(int i=0;i<n;i++){
            pq.add(new Node(start[i], end[i]));
        }
        int open = pq.peek().start;
        int close = pq.peek().end;
        pq.poll();
        int ans = 1;
        for(int i=1;i<n;i++){
            if(pq.peek().start>close){
                ans++;
                open = pq.peek().start;
                close=pq.peek().end;
            }
            pq.poll();
        }

        return ans;

    }

    class Node implements Comparable<Node>{
        int start;
        int end;
        
        public Node(int start, int end){
            this.start = start;
            this.end = end;
            
        }

        @Override
        public int compareTo(Node that) {
            return Integer.compare(this.end, that.end);
        }

    }

    
    class Solution {
        // Function to find the maximum number of meetings that can
        // be performed in a meeting room.
        public int maxMeetings(int start[], int end[]) {
            // add your code here
            List<Node> list = new ArrayList<>();
            for(int i=0; i<start.length; i++){
                list.add(new Node(start[i], end[i]));
            }
            
            Collections.sort(list, (a, b) -> Integer.compare(a.end,b.end));
            
            int begin = list.get(0).start;
            int close = list.get(0).end;
            int count =1;
            
            for(int i=1; i<list.size(); i++){
                if(list.get(i).start>close){
                    count++;
                    begin =list.get(i).start;
                    close = list.get(i).end;
                }
            }
            return count;
     
        }
        
        class Node{
            int start;
            int end;
            
            public Node(int start, int end){
                this.start = start;
                this.end = end;
                
            }
        }
    }
}
