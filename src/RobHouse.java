import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RobHouse {


    public int rob(int[] nums) {
        int[] total=new int[nums.length+1];
        total[0]=0;
        total[1]=nums[0];
        for(int i=1; i<nums.length; i++){
            total[i+1]=Math.max(total[i-1]+nums[i], total[i]);
        }
        System.out.println(Arrays.toString(total));
        return total[nums.length];

    }


}
