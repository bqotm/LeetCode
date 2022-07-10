import java.util.Map;

public class _MAIN {


    public static void main(String[] args) {

        Huffman huffman=new Huffman();
        String msg="reject modernity embrace orthodoxy";
        String code=huffman.encode(msg);
        /*for(Map.Entry<Character, String> entry: huffman.huffmanTable.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/  // huffmanTable : character -> binary string
        System.out.println("xxxxxxxxxxxxxx code xxxxxxxxxxxxxxx");
        System.out.println(code);
        String original=huffman.decode(code);
        System.out.println("xxxxxxxxxxxxxx original xxxxxxxxxxxxxxx");
        System.out.println(original);

        //String or= huffman.decode("110");
        //System.out.println(or);

    }
}
