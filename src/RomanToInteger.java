import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {

        int res=0;
        Map<Character, Integer> values=Map.of(
                'I'     , 1,
                'V'     ,5,
                'X'     ,10,
                'L'     ,50,
                'C'     ,100,
                'D'     ,500,
                'M'      ,1000
        );
        for (int i = 0; i < s.length() ;) {
            if(i==s.length()-1){
                res+=values.get(s.charAt(i));
                break;
            }
            if(values.get(s.charAt(i))<values.get(s.charAt(i+1))){
                res+=values.get(s.charAt(i+1))-values.get(s.charAt(i));
                i+=2;
            } else {
                res+=values.get(s.charAt(i));
                i++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
