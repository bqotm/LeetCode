import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {


    public static List<List<Integer>> subsets(int[] nums) {
        int length=nums.length;
        List<List<Integer>> all=new ArrayList<>();
        for(Integer i=0; i<(1<<length); i++){
            List<Integer> subset=new ArrayList<Integer>();
            for (Integer j = 0; j < length; j++) {
                if((i & (1<<j))!=0){
                    subset.add(nums[j]);
                }
            }
            all.add(subset);
        }
        return all;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> all=subsets(nums);
        /*for(List list: all){
            for(Object n:list){
                System.out.print(n);
            }
            System.out.println();
        }*/

        all.stream().forEach(list-> System.out.println(list));
    }

}
