import java.util.ArrayList;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> list;
    int len;

    public MedianFinder() {
        list = new PriorityQueue<>();
        len = 0;
    }

    public void addNum(int num) {
        this.list.add(num);
        this.len++;
    }

    public double findMedian() {
        int n = this.len;
        if (n % 2 == 0) {
            int count = n / 2;
            ArrayList<Integer> temp = new ArrayList<>();
            while (count-- > 0) {
                temp.add(list.poll());
            }
            double num1 = temp.get(temp.size()-1);
            double num2 =  temp.get(temp.size()-2);
            for (int i = 0; i < temp.size(); i++) {
                list.add(temp.get(i));
            }
            return (num1+num2)/2;
        } else {
            int count = n / 2;
            ArrayList<Integer> temp = new ArrayList<>();
            while (count-- > 0) {
                temp.add(list.poll());
            }
            double res = temp.get(temp.size()-1);
            for (int i = 0; i < temp.size(); i++) {
                list.add(temp.get(i));
            }
            return res;
        }
    }
}
