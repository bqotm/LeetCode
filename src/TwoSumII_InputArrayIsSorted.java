import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSumII_InputArrayIsSorted {




    public int[] twoSum(int[] numbers, int target) {
        int i=0, j= numbers.length-1;
        int[] sol=new int[2];
        while(i<j){
            if(numbers[i]+numbers[j]<target){
                i++;
            } else if( numbers[i]+numbers[j]>target){
                j--;
            } else {
                sol[0]=i+1;
                sol[1]=j+1;
            }
        }
        return sol;
    }

    public int[] twoSumUnsorted(int[] nums, int target) {
        int[] copy=Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int i=0, j=copy.length-1;
        int[] sol=new int[2];
        while(i<j){
            if(copy[i]+copy[j]<target){
                i++;
            } else if( copy[i]+copy[j]>target){
                j--;
            } else {
                int finalI = i;
                sol[0]= IntStream.range(0, nums.length).filter(x -> copy[finalI]==nums[x]).findFirst().getAsInt();
                int finalJ = j;
                sol[1]=IntStream.range(0, nums.length).filter(x -> copy[finalJ]==nums[x] && x!=sol[0]).findFirst().getAsInt();
                break;
            }
        }
        return sol;
    }

    public int[] twoSumElegant(int[] nums, int target) {

        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                return new int[]{map.get(diff), i};
            }
        }
        return new int[] {-1,-1};

    }
}