import java.util.*;

public class CombinationSum {





    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        Arrays.sort(candidates);
        proc(candidates, target, sub, res, 0);
        return res;
    }

    public void proc(int[] candidates, int target,List<Integer> sub, List<List<Integer>> res, int start) {
        if(target==0){
            res.add(new ArrayList<>(sub));
            return;
        }if(target<Arrays.stream(candidates).min().getAsInt()){
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            int diff=target-candidates[i];
            sub.add(candidates[i]);
            proc(candidates, diff, sub, res, i);
            sub.remove(sub.size()-1);
        }
    }



}
