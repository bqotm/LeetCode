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
        Map<Character, Integer> alph= IntStream.rangeClosed('A', 'Z')
                .collect(
                        HashMap::new,
                        (map, c) -> map.put((char) c, c + (1 - 'A')),
                        HashMap::putAll
                );

        for(Map.Entry<Character, Integer> entry: alph.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
