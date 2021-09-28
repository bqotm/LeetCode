import java.util.HashSet;
import java.util.Set;

public class HappyNumber {


    public static boolean isHappy(int n) {
        return helper(n, new HashSet<Integer>());
    }

    public static boolean helper(int n, Set<Integer> set){
        int res=0;
        while(n!=0){
            res+=Math.pow(n%10,2);
            n=n/10;
        }
        //System.out.println(res);
        if(set.contains(res))
            return false;
        else if(res==1)
            return true;
        else{
            return set.add(res) && helper(res, set);
        }
    }


    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
