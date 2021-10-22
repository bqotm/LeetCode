import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        String str=new String();
        paths(root, str, res);
        return res;
    }

    private void paths(TreeNode root, String p, List<String> res) {
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            p+=(Integer.toString(root.val));
            res.add(p);
        } else {
            p+=(Integer.toString(root.val))+"->";
        }
        paths(root.left, p, res);
        paths(root.right, p, res);

    }


}
