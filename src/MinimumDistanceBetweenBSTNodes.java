import java.util.*;

public class MinimumDistanceBetweenBSTNodes {



    Integer min=100_000, prev=null;
    public int minDiffInBST(TreeNode root) {
        if(root!=null){
            minDiffInBST(root.left);
            if(prev!=null){
                min=Math.min(min, root.val-prev);
            }
            prev=root.val;
            minDiffInBST(root.right);
        }
        return min;
    }

   /* public int minDiffInBST(TreeNode root) {
        Integer min=100_000, prev=null;
        inorder(root, min, prev);
        return min;
    }

    void inorder(TreeNode root, Integer min, Integer prev){
        if(root!=null){
            inorder(root.left, min, prev);
            if(prev!=null){
                min=Math.min(min, root.val-prev);
            }
            prev=root.val;
            inorder(root.right, min, prev);
        }
    }*/
}
