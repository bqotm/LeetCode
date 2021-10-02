import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllNumbersDisappeared {


    /*
           in [4,3,2,7,8,2,3,1]
           out [5,6]
     */

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int[] all=new int[n+1];
        for (int i = 0; i < n; i++) {
            all[nums[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if(all[i]==0)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(findDisappearedNumbers(arr).toArray()));
    }


}
