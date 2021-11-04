import java.util.Map;

public class _MAIN {




    public static void main(String[] args) {

        Huffman huffman=new Huffman();
        String msg="leemmm";
        String code=huffman.encode(msg);
        for(Map.Entry<Character, String> entry: huffman.huffmanTable.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(code);

    }
}
