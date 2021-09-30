public class MaxConsecutiveOnes {



    public int findMaxConsecutiveOnes(int[] nums) {
        int gmax=0, max=0;
        for(int num : nums){
            if(num==1)
                max++;
            else {
                gmax=Math.max(max,gmax);
                max=0;
            }
        }
        return Math.max(gmax, max);
    }


}
