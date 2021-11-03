import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeafSimilar {




    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        dfs_inorder(root1, l1);
        dfs_inorder(root2, l2);
        if(l1.equals(l2))
            return true;
        return false;
    }


    public void dfs_inorder(TreeNode root, List<Integer> list){
        if(root!=null){
            dfs_inorder(root.left, list);
            if(root.left==null && root.right==null)
                list.add(root.val);
            dfs_inorder(root.right, list);
        }
    }


}
