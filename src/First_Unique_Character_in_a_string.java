import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class First_Unique_Character_in_a_string {





    public int firstUniqChar(String s) {
        Map<Character, Integer> map=new HashMap<>();
        Queue<String> queue=new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()==1)
                return s.indexOf(entry.getKey());
        }
        return -1;

        
    }


}
