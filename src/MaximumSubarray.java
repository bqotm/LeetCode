import java.util.Arrays;

public class MaximumSubarray {


    public static int maxSubArray(int[] nums) {

        int max=0, gmax=0;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max+nums[i], nums[i]);
            if(max>gmax)
                gmax=max;
        }
        return gmax;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
