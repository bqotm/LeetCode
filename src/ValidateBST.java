import java.util.ArrayList;
import java.util.List;

public class ValidateBST {



    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> x=new ArrayList<>();
        inorder(root,x);
        for(int i=0; i<x.size()-1; i++){
            if(x.get(i+1)<x.get(i)){
                return false;
            }
        }
        return true;

    }

    public static void inorder(TreeNode root,ArrayList<Integer> list){
        if(root != null){
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }
}
