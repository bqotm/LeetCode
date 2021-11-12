import java.util.ArrayList;
import java.util.List;

public class RecoverBinarySearchTree {


    // 1 2 3 9* 6 7 8 5* 10
    // 1 4* 3 2* 5 6 8 9
    // 1 3* 2* 4
    TreeNode p=null;
    TreeNode q=null;
    TreeNode tmp=new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        inorder(root);
    }

    void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        if(p==null && tmp.val>root.val){
            p=tmp;
            q=root;
        }
        if(tmp.val>root.val && p!=null){
            q=root;
        }
        tmp=root;
        inorder(root.right);
        int k=p.val;
        p.val=q.val;
        q.val=k;

    }




}
