import java.util.Arrays;
import java.util.BitSet;

public class SingleNumber {


    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0; i<nums.length; i++){
            res=res^nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int x=19>>1;
        System.out.println(x);
    }

}
