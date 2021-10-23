import java.util.LinkedList;
import java.util.Queue;

public class UnivaluedBinaryTree {


    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            if(current.val!=root.val){
                return false;
            }
            if(current.right!=null) queue.add(current.right);
            if(current.left!=null) queue.add(current.left);
        }
        return false;
    }

}
