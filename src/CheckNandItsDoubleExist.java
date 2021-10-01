import java.util.HashMap;
import java.util.HashSet;

public class CheckNandItsDoubleExist {



    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr) {
            if(set.contains(n*2) || (n%2 == 0 && set.contains(n/2)))
                return true;
            set.add(n);
        }
        return false;
    }

}
