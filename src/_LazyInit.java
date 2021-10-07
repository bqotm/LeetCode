import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _LazyInit {


    enum AngelType {
        Seraphim,
        Cherubim,
        Ophanim,
        Thrones,
    }

    static class Angel {
        private final static Map<AngelType, Angel> types=new HashMap<>();

        private Angel(AngelType type){}

        public static Angel getAngelByType(AngelType type){
            Angel angel;
            if(!types.containsKey(type)){
                angel=new Angel(type);
                types.put(type, angel);
            } else {
                angel=types.get(type);
            }
            return angel;
        }

        public static Angel getAngelByTypeThreadSafe(AngelType type){
            Angel angel;
            if(!types.containsKey(type)){
                synchronized (types){
                    if(!types.containsKey(type)){
                        types.put(type, new Angel(type));
                    }
                }
            }
            return types.get(type);
        }

        public static void showAll(){
            if(types.size()>0){
                System.out.println("number pf instances = "+types.size());
                for(Map.Entry<AngelType, Angel> entry : types.entrySet()){
                    String angel=entry.getKey().toString();
                    System.out.println(angel);
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Angel.getAngelByType(AngelType.Seraphim);
        Angel.showAll();

        Angel.getAngelByType(AngelType.Ophanim);
        Angel.showAll();

        Angel.getAngelByType(AngelType.Ophanim);
        Angel.showAll();

        Angel.getAngelByType(AngelType.Cherubim);
        Angel.showAll();

        Angel.getAngelByType(AngelType.Cherubim);
        Angel.showAll();
    }




}
