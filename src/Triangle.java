import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {


    public static int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> listt=triangle.get(triangle.size()-1);
        int[] sum = new int[listt.size()];
        for(int i=0; i<listt.size(); i++){
            sum[i]=listt.get(i);
        }

        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                sum[j]=Math.min(sum[j], sum[j+1])+triangle.get(i).get(j);
            }
        }

        return sum[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> x = Arrays.asList(Arrays.asList(-1), Arrays.asList(2, 3), Arrays.asList(1, -1, -3));
        System.out.println(minimumTotal(x));
    }


}
