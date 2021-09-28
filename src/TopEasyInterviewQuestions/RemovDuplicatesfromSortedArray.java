package TopEasyInterviewQuestions;

import java.util.Arrays;

public class RemovDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int i=0, j=0;
        while(j<nums.length){
            while(nums[j]==nums[i])
                j++;
            for(int k=i+1; k<j; k++){
                nums[k]=nums[j];
            }
            i=i+1;
            if(j==nums.length-1)
                return i+1;
        }
        return i+1;
    }

    public static void main(String[] args) {
        //int[] nums={0,0,1,1,1,2,2,3,3,4};
        int[] nums=new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

}
