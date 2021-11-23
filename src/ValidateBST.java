import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    public boolean _isValidBST(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        if(root==null)
            return true;
        TreeNode prev=null;
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;

            }
            root=stack.pop();
            //
            if(prev!=null && root.val<=prev.val)
                return false;
            prev=root;
            root=root.right;
        }
        return true;

    }


}
