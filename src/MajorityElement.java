public class MajorityElement {



    public int majorityElement(int[] nums) {
        int c=1,m=nums[0];
        for(int i=1; i<nums.length; i++){
            if(c==0){
                c++;
                m=nums[i];
            } else if(nums[i]==m){
                c++;
            } else{
                c--;
            }
        }
        return m;
    }
}
