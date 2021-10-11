import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {


    public static List<String> summaryRanges(int[] nums) {

        List<String> res=new ArrayList<>();
        int l=0,r=0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]-nums[i]==1)
                r++;
            else{
                if (nums[l]==nums[r]) {
                    res.add(Integer.toString(nums[l]));
                } else {
                    res.add(nums[l]+"->"+nums[r]);
                }
                l=r+1;
                r=l;
            }
        }
        if (nums[l]==nums[r]) {
            res.add(Integer.toString(nums[l]));
        } else {
            res.add(nums[l]+"->"+nums[r]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={0,2,3,4,6,8,9};
        System.out.println(Arrays.toString(summaryRanges(nums).toArray()));
    }


}
