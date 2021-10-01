package TopEasyInterviewQuestions;

import java.util.Arrays;

public class RemovDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int j=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[j]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        //int[] nums={0,0,1,1,1,2,2,3,3,4};
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

}
