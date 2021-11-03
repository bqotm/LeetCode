import java.util.Arrays;

public class MoveZeroes {


    public static void moveZeroes(int[] nums) {
        int[] clean=new int[nums.length];
        int j=0,k;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                k=nums[i];
                nums[i]=nums[j];
                nums[j]=k;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        /*int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));*/

        System.out.println(2^3);
    }


}
