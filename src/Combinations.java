import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Combinations {


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> combination=new ArrayList<>();
        Combination(res,1, k, n,combination);
        return res;

    }

    private void Combination(List<List<Integer>> res, int start,int k, int n, List<Integer> combination) {

        if(k==0){
            res.add(new ArrayList<>(combination));
            return;
        }
        for(int i=start; i<=n; i++){
            combination.add(i);
            Combination(res, i+1, k-1, n, combination);
            combination.remove(combination.size()-1);
        }
    }

}
