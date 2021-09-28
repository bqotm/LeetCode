import java.util.ArrayList;
import java.util.List;

public class N_aryTree {

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;
        public Node() {
        }
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> res=new ArrayList<>();
        _preorder(root, res);
        return res;
    }

    public void _preorder(Node node, List<Integer> list){
        if(node==null)
            return;
        list.add(node.val);
        for(Node child: node.children){
            _preorder(child, list);
        }
    }


}
