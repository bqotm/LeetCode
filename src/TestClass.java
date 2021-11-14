import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TestClass {


    public static void main(String[] args) {

        int[] arr={1,3,5};

        /*Integer sum=Arrays.stream(arr).reduce(0, Integer::sum);
        System.out.println(sum);*/
       /* Map<Character, Integer> alph= IntStream.rangeClosed('A', 'Z')
                .collect(
                        HashMap::new,
                        (map, c) -> map.put((char) c, c + (1 - 'A')),
                        HashMap::putAll
                );

        for(Map.Entry<Character, Integer> entry: alph.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
        int[][] board=new int[9][9];
        for (int x = 0; x < 9; x=x+3) {
            for (int y = 0; y < 9; y=y+3) {
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        System.out.print(i+" "+j+",");
                    }
                    System.out.println();
                }
                System.out.println();

            }
        }


    }
}
