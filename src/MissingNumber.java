public class MissingNumber {



    public int missingNumber(int[] nums) {
        int[] freq=new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]==0)
                return i;
        }
        //return -1;
        // using xor property b^a^b=a
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res=res^i^nums[i];
        }
        return res^nums.length;
        
    }


}
