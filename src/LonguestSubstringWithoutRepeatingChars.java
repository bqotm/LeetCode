import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LonguestSubstringWithoutRepeatingChars {




    public static int lengthOfLongestSubstring(String s) {
        int gmax=0;
        HashSet<Character> set=new HashSet<>();
        int l=0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            gmax=Math.max(gmax, r-l+1);
        }
        return gmax;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
