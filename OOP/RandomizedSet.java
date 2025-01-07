import java.util.HashSet;

class RandomizedSet {

    private HashSet Set;
    
    public RandomizedSet() {
        this.Set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if (Set.contains(val)) {
            return false;
        }
        Set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (Set.contains(val)) {
            Set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int size = Set.size();
        int item = (int) (Math.random() * size);
        int i = 0;
        for (Object obj : Set) {
            if (i == item) {
                return (int) obj;
            }
            i++;
        }
        return -1;
    }
}