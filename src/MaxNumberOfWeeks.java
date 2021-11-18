import java.util.Arrays;

public class MaxNumberOfWeeks {

    public int maxWeeks(int[] proC){
        int max= Arrays.stream(proC).max().getAsInt();
        int sum= Arrays.stream(proC).sum()-max;
        System.out.println(max);
        if(sum<max){
            return 2*sum+1;
        } else {
            return sum+max;
        }


    }


}
