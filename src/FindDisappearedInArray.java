import java.util.ArrayList;
import java.util.List;

public class FindDisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res=new ArrayList();
        int n=nums.length;
        int[] all=new int[n+1];
        for(int i=0; i<n; i++){
            all[nums[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(all[i]==0)
                res.add(i);
        }
        return res;
    }
}
