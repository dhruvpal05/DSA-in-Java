package pakages;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> list = combination(candidates, target);
        // for (int i = 0; i < list.size(); i++) {
        //     for (int j = 0; j < list.get(i).size(); j++) {
        //         System.out.print(list.get(i).get(j) + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println(list);
    }

    static List<List<Integer>> combination(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findcombinations(0, candidates,target,ans,new ArrayList<>());
        return ans;
    }

    private static void findcombinations(int i, int[] candidates, int target, List<List<Integer>> ans,List<Integer> arrayList) {
        if(i == candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(arrayList));
            }
            return;
        };
        if(candidates[i] <= target){
            arrayList.add(candidates[i]);
            findcombinations(i, candidates, target-candidates[i], ans, arrayList);
            arrayList.remove(arrayList.size()-1);
        }
        findcombinations(i+1, candidates, target, ans, arrayList);
    };
}
