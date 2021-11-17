import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lostCharNW {

    public static char lostChar(String stringSent, String stringRec){

        Set<Character> set=new HashSet<>();
        for (int i = 0; i < stringSent.length(); i++) {
            set.add(stringSent.charAt(i));
        }
        for (int i = 0; i < stringRec.length(); i++) {
            if(set.contains(stringRec.charAt(i)))
                set.remove(stringRec.charAt(i));
            else
                return stringRec.charAt(i);
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        String s="abx", r="absx";
        System.out.println(lostChar(s, r));
    }



}
