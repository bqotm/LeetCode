import java.util.ArrayList;

public class BSTIterator {


    ArrayList<Integer> elements;
    int current;
    int idx=-1;

    public BSTIterator(TreeNode root) {
        this.elements=new ArrayList<Integer>();
        fill_inorder(root);
    }

    public void fill_inorder(TreeNode root){
        if(root != null){
            fill_inorder(root.left);
            elements.add(root.val);
            fill_inorder(root.right);
        }
    }

    public int next() {
        return elements.get(++idx);
    }

    public boolean hasNext() {
        if(idx>=elements.size()-1)
            return false;
        return true;
    }


}
