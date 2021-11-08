import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {



    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permutation(nums,0,res);
        return res;

    }

    private void permutation(int[] nums, int start, List<List<Integer>> res) {
        if(start==nums.length-1){
            List<Integer> c= Arrays.stream(nums).boxed().collect(Collectors.toList());
            res.add(c);
        }

        for(int i=start; i<nums.length; i++){
            nums[start]=nums[start]^nums[i]^(nums[i]=nums[start]);
            permutation(nums, start+1, res);
            nums[start]=nums[start]^nums[i]^(nums[i]=nums[start]);
        }
    }


}

