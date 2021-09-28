import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    /*

        egg  e->a  g->d
        add  a->e  d->g

        bada b->b a->a d->b
        baba b->b  a->a

        foo  f->b o->a
        bar  b->f a->o

        badc b->b a->a d->b
        baba b->b a->a b->d

     */
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> t_s=new HashMap<>();
        Map<Character, Character> s_t=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char u=s.charAt(i);
            char v=t.charAt(i);
            if(!s_t.containsKey(u)){
                s_t.put(u, v);
                t_s.put(v, u);
            } else if(s_t.get(u)!=v || t_s.get(v)!=u || s_t.containsKey(v)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("bada","baba"));
        System.out.println(isIsomorphic("foo","bar"));
    }

}
