import java.util.ArrayList;

public class SmallestInfi {
    class SmallestInfiniteSet {

        ArrayList<Integer> list;

        public SmallestInfiniteSet() {
            list = new ArrayList<>();
        }

        private int parent(int index) {
            return (index - 1) / 2;
        }

        private int left(int index) {
            return index * 2 + 1;
        }

        private int right(int index) {
            return index * 2 + 2;
        }

        private void upheap(int index) {
            if (index == 0) {
                return;
            }
            int p = parent(index);
            if (list.get(index).compareTo(list.get(p)) < 0) {
                swap(index, p);
                upheap(p);
            }
        }

        private void swap(int first, int second) {
            int temp = list.get(first);
            list.set(first, list.get(second));
            list.set(second, temp);
        }

        public int popSmallest() {
            int temp = list.get(0);

            int last = list.remove(list.size() - 1);
            if (!list.isEmpty()) {
                list.set(0, last);
                downheap(0);
            }

            return temp;

        }

        private void downheap(int index) {
            int min = index;
            int left = left(index);
            int right = right(index);

            if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
                min = left;
            }

            if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
                min = right;
            }

            if (min != index) {
                swap(min, index);
                downheap(min);
            }
        }

        public void addBack(int num) {
            list.add(num);
            upheap(list.size() - 1);
        }
    }
}
