import java.util.Arrays;

public class ValidAnagram {


    public static boolean isAnagram(String s, String t) {
        int[] alph=new int[26];
        for(int i=0; i<s.length();i++){
            alph[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length();i++){
            alph[t.charAt(i)-'a']--;
        }
        for(int i=0; i<alph.length;i++){
            if(alph[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
       // System.out.println(Arrays.toString(isAnagram("catt","d")));
    }

}
