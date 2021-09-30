import java.util.Arrays;

public class SquaresofaSortedArray {


    public static int[] sortedSquares(int[] nums) {

        int[] squares=new int[nums.length];

        int i=0,x,j=x=nums.length-1;
        while (i!=j){
            if(nums[i]*nums[i] <= nums[j]*nums[j]){
                squares[x]=nums[j]*nums[j];
                j--;
                x--;
            }
            if(nums[i]*nums[i] > nums[j]*nums[j]){
                squares[x]=nums[i]*nums[i];
                i++;
                x--;
            }
        }
        squares[x]=nums[i]*nums[i];
        return squares;
    }

    public static void main(String[] args) {
        int[] nums={-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

}
