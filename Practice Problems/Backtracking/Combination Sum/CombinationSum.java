import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CombinationSum {

    public static void main(String args[]) {
        int[] candidates = {2, 3, 6, 7}; 
        int target = 7;

        List<List<Integer>> solution = combinationSum(candidates, target);

        System.out.println("[");
        for(int i = 0; i<solution.size(); i++) {
            List<Integer> row = solution.get(i);
            System.out.println(" " + row + ",");
        }
        System.out.println("]");
        
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0) {
            return Collections.emptyList();
        }
        
        final List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        helper(candidates, target, 0, new ArrayList<>(), res);
        
        return res;
    }
    
    private static void helper(int[] candidates, int target, int pos, List<Integer> comb, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(comb));
            return;
        }
        
        for(int i = pos; i< candidates.length; i++) {
            int newTarget = target - candidates[i];
            
            if(newTarget >= 0) {
                comb.add(candidates[i]);
                helper(candidates, newTarget, i, comb, res);
                comb.remove(comb.size() - 1);
            } else {
                break;
            }
        }
    }
}