import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CousinsBinaryTree {



    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)   return false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int depth=0;
        int dx=-2,dy=-1;
        TreeNode X=null,Y=null;
        while(!queue.isEmpty()){
            int s=queue.size();
            for(int i=0; i<s; i++){
                TreeNode curr=queue.poll();
                if(curr.val==x){
                    dx=depth;
                    X=curr;
                }
                if(curr.val==y){
                    dy=depth;
                    Y=curr;
                }
                if(dx==dy){
                    return !isSiblings(root, X, Y);
                }
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            depth++;
        }
        return false;


    }

    public boolean isSiblings(TreeNode root, TreeNode a, TreeNode b){
        if(root==null)
            return false;
        return (root.right==a && root.left==b) || (root.right==b && root.left==a) || isSiblings(root.left, a, b) || isSiblings(root.right, a, b);

    }




}
