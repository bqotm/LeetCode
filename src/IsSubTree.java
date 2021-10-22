import java.util.LinkedList;
import java.util.Queue;

public class IsSubTree {




    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean flag=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr=queue.poll();
            if(curr.val==subRoot.val){
                flag=flag || equalBT(subRoot, curr);
            }
            if(curr.left!=null) queue.add(curr.left);
            if(curr.right!=null) queue.add(curr.right);
        }
        return flag;
    }

    public boolean equalBT(TreeNode a, TreeNode b){
        if(a==null && b==null)
            return true;
        else if(a==null || b==null)
            return false;
        if(a.val==b.val)
            return equalBT(a.left, b.left) && equalBT(a.right, b.right);
        return false;
    }

}
