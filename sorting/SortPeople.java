/**
 * SortPeople
 */
public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if(heights[j]<heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                    String temp2 = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp2;
                }
            }
        }
        return names;
    }

    private void swap(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swap'");
    }
}