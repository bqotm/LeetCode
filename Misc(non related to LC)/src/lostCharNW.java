import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lostCharNW {

    public static char lostChar(String stringSent, String stringRec){
        if(stringSent.length()<stringRec.length())
            return lostChar(stringRec, stringSent);
        for(int i=0, j=0; i<stringSent.length() && j<stringRec.length(); i++, j++){
            if(stringSent.toLowerCase().charAt(i)!=stringRec.toLowerCase().charAt(j))
                return stringSent.charAt(i);
        }
        return stringSent.charAt(stringSent.length()-1);

    }

    public static void main(String[] args) {
        String s="ab", r="aBx";
        System.out.println(lostChar(s, r));
    }



}
