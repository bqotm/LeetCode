import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {



    public boolean containsDuplicate(int[] nums) {
        Set<Integer> occ=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(occ.contains(nums[i]))
                return true;
            occ.add(nums[i]);
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i)<=k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i)<=k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
