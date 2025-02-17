package Arrays;

import java.util.ArrayList;

public class ProdOfLastK {

    class ProductOfNumbers {
        ArrayList<Integer> nums;

        public ProductOfNumbers() {
            nums = new ArrayList<>();
        }

        public void add(int num) {
            this.nums.add(num);

        }

        public int getProduct(int k) {
            int n = this.nums.size() - 1;
            int ans = this.nums.get(n);
            for (int i = 1; i < k; i++) {
                ans *= this.nums.get(n - i);
            }
            return ans;
        }
    }
}