import java.util.ArrayList;

public class ArryListRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,6,7,8};
        ArrayList<Integer> list = new ArrayList<Integer>();
       
        System.out.println( arrayList(arr, 5, 0, list));
    }

    static ArrayList<Integer> arrayList(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return arrayList(arr, target, index +1, list);
    }
}
