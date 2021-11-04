import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Huffman {

    HashMap<Character, String> huffmanTable;
    Node root;

    class Node {
        public char c;
        public int frequency;
        public Node left;
        public Node right;
        Node(char c, int frequency) {
            this.c = c;
            this.frequency = frequency;
            this.left = null;
            this.right = null;
        }
        Node(char c, int val, Node left, Node right) {
            this.c = c;
            this.frequency = val;
            this.left = left;
            this.right = right;
        }
    }

    public Huffman(){
        huffmanTable=new HashMap<>();
        root=null;
    }

    void createHuffmanTable(Node root, String encoding){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            huffmanTable.put(root.c, encoding);
            return;
        }
        createHuffmanTable(root.left, encoding+"0");
        createHuffmanTable(root.right, encoding+"1");
    }

    public String encode(String message){
        Map<Character, Integer> freq_map=new HashMap<>();
        for(int i=0; i<message.length(); i++){
            freq_map.put(message.charAt(i), freq_map.getOrDefault(message.charAt(i),0)+1);
        }
        for(Map.Entry<Character, Integer> entry: freq_map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue()+" ");
        }
        PriorityQueue<Node> priorityQueue=new PriorityQueue<>(message.length(),(a,b)->a.frequency-b.frequency);
        for(Map.Entry<Character, Integer> entry: freq_map.entrySet()){
            priorityQueue.add(new Node(entry.getKey(), entry.getValue()));
        }
        root=null;
        if(priorityQueue.size()==1){
            root=priorityQueue.poll();
            return "1";
        }
        while(priorityQueue.size()>1){
            Node a=priorityQueue.poll();
            Node b=priorityQueue.poll();
            Node node=new Node('\0', a.frequency+b.frequency,a ,b);
            root=node;
            priorityQueue.add(node);
        }
        createHuffmanTable(root, "");
        StringBuilder encoded=new StringBuilder();
        for(int i=0; i<message.length(); i++){
            encoded.append(huffmanTable.get(message.charAt(i)));
        }
        return encoded.toString();
    }

    public String decode(String code){//code is series of 1s and 0s
        StringBuilder decoded=new StringBuilder();
        Node current=root;
        //System.out.println(root.c+" "+root.frequency);
        if(code.length()==1)
            return Character.toString(root.c);
        for (int i = 0; i < code.length(); i++) {
            if(current==null)
                continue;
            if(code.charAt(i)=='0' && current.left!=null){
                current=current.left;
            } else if(code.charAt(i)=='1' && current.right!=null){
                current=current.right;
            } else {
                throw new RuntimeException("code is not binary");
            }
            if(current.left==null & current.right==null){
                decoded.append(current.c);
                current=root;
            }
        }
        return decoded.toString();

    }

}
