import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CousinsBinaryTree {



    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int depth=0;
        int dx=-2,dy=-1;
        while(!queue.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int s=queue.size();
            for(int i=0; i<s; i++){
                TreeNode curr=queue.poll();
                if(curr.val==x)
                    dx=depth;
                if(curr.val==y)
                    dy=depth;
                if(dx==dy){
                    return !isSiblings(root, x, y);
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

    public boolean isSiblings(TreeNode root, int a, int b){
        if(root==null)
            return false;
        return (root.right.val==a && root.left.val==b) || (root.right.val==b && root.left.val==a) || isSiblings(root.left, a, b) || isSiblings(root.right, a, b);

    }




}
