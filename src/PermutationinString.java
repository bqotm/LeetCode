import java.util.HashMap;
import java.util.Map;

public class PermutationinString {



    public boolean checkInclusion(String s1, String s2) {



        int n=s1.length();
        int k;
        Map<Character, Integer> s1_map=new HashMap<>();
        for(int i=0; i<n; i++){
           s1_map.put(s1.charAt(i), s1_map.getOrDefault(s1.charAt(i),0)+1);
        }
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0; i<=s2.length()-n; i++){
            for(int j=i; j<i+n; j++){
                map.put(s2.charAt(j), map.getOrDefault(s2.charAt(j),0)+1);
            }
            k=0;
            for(int j=i; j<i+n; j++){
                s1_map.equals(map);
            }
            map.clear();
            if(k==n)
                return true;
        }
        return false;
    }
}
