import java.util.Arrays;

public class SortArrayByParity {


    public static int[] sortArrayByParity(int[] nums) {

        int i=0, j=nums.length-1,k;
        while(i<j){
            if(nums[i]%2!=0 && nums[j]%2==0){
                k=nums[i];
                nums[i]=nums[j];
                nums[j]=k;
                j--;
                i++;
            }
            if(nums[i]%2==0)
                i++;
            if(nums[j]%2!=0)
                j--;
        }
        return nums;

    }


    public static void main(String[] args) {

        int[] arr={3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

}
