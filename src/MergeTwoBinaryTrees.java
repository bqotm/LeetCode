import java.util.LinkedList;
import java.util.Queue;

public class MergeTwoBinaryTrees {




    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode merged=null;
        if(root1==null && root2!=null)
            return root2;
        else if(root1!=null && root2==null)
            return root1;
        else if(root1==null && root2==null)
            return null;
        merged=new TreeNode(root1.val+root2.val);
        merged.left=mergeTrees(root1.left, root2.left);
        merged.right=mergeTrees(root1.right, root2.right);
        return merged;

    }





}
