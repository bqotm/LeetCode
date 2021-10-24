import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sumRootToLeaf {

    public int sumRootToLeaf(TreeNode root) {
        String str=new String();
        return paths(root, str);
    }

    private int paths(TreeNode root, String p) {
        int ctr=0;
        if(root==null)
            return 0;
        if(root.left==null && root.right==null){
            p+=Integer.toString(root.val);
            return Integer.parseInt(p, 2);
        } else {
            p+=Integer.toString(root.val);
        }
        ctr+=paths(root.left, p);
        ctr+=paths(root.right, p);
        return ctr;
    }

}
