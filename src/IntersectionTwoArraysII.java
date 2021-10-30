import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArraysII {




    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res=new ArrayList<Integer>();
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                res.add(nums1[i]);
                j++;
                i++;
            } else if(nums2[j]>nums1[i]){
                i++;
            } else{
                j++;
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }


}
