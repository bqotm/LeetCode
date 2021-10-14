import java.util.Arrays;

public class LonguestIncreasingSubsequence {



    public int lengthOfLIS(int[] nums) {

        int[] res=new int[nums.length];
        Arrays.fill(res, 1);
        for(int j=1; j < nums.length; j++){
            for(int i=0; i < j; i++){
                if(nums[j]>nums[i]){
                    res[i]=Math.max(res[i]+1, res[j]);
                }
            }
        }
        return Arrays.stream(res).max().getAsInt();
    }


}
