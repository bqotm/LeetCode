import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _Sol {


    public static String compute(String code) {
        // Write your code here
        String[] letters={"#", "ABC", "DEF", "GHI","JKL","MNO","PQR","STU","VWX","YZ"};
        StringBuilder res=new StringBuilder();
        String[] splitted=code.split(" ",-2);
        for(String chunk: splitted){
            int size=chunk.length();
            int a=Integer.parseInt(String.valueOf(chunk.charAt(0)));
            res.append(letters[a].charAt(size-1));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String x="444 22 111 555 2 22 6 555 777 666 555 777 8 666 333 666 5 1 111 1 11 333 55 22 77 22 444 22 6 33 555 55 333 66 777 22 22 7 77 7 333 888 2 22 777 888 77 666 555 333 7 55 22 777 222";

        System.out.println(compute(x));

    }
}
