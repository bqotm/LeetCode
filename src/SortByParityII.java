import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SortByParityII {



    public static int[] sortArrayByParityII(int[] nums) {
        Stack<Integer> oddsNotInPlace=new Stack<>();
        Stack<Integer> evensNotInPlace=new Stack<>();
        for(int i=0; i<nums.length; i++){
            if((nums[i]+i)%2==0)
                continue;
            if(nums[i]%2==0)
                evensNotInPlace.add(nums[i]);
            else
                oddsNotInPlace.add(nums[i]);
        }
        for(int i=0; i<nums.length;i++){
            if((nums[i]+i)%2!=0){
                if(i%2==0)
                    nums[i]=evensNotInPlace.pop();
                else
                    nums[i]=oddsNotInPlace.pop();
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={4,1,2,1};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
}
