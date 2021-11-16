import java.util.HashMap;

public class RansomNote {






    public boolean canConstruct(String ransomNote, String magazine) {

        int[] alph=new int[26];
        for (int i = 0; i < ransomNote.length() ; i++) {
            alph[ransomNote.charAt(i)-'a']++;
        }
        for (int i = 0; i < magazine.length() ; i++) {
            alph[magazine.charAt(i)-'a']--;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(alph[ransomNote.charAt(i)-'a']>0)
                return false;
        }
        return true;



    }




}
