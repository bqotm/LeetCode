import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {




    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root, list);
        TreeNode x=new TreeNode(0), c=x;
        for(Integer val: list){
            c.right=new TreeNode(val);
            c=c.right;
        }
        return x.right;
    }

    void inorder(TreeNode root, List<Integer> list){
        if(root!=null){
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }



}
