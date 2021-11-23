import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class TwoSumIVInputisaBST {




    public boolean findTarget(TreeNode root, int k) {

        Set<Integer> set=new HashSet<>();

        return find(root,k,set);
    }

    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if(root==null)
            return false;
        if(set.contains(k-root.val))
            return true;
        set.add(root.val);
        return find(root.right, k, set) || find(root.left, k, set);
    }

    public boolean inorder(TreeNode root, int k){
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        if(root==null)
            return false;
        TreeNode curr=root;
        while(root!=null || !stack1.isEmpty() || !stack2.isEmpty()){
            while(root!=null){
                stack1.push(root);
                root=root.left;
            }
            while(curr!=null){
                stack2.push(root);
                curr=curr.right;
            }
            root=stack1.pop();
            curr=stack2.pop();
            System.out.println(root.val);
            if(root.val+curr.val<k)
                root=root.right;
            else if(root.val+curr.val>k)
                curr=curr.left;
            else
                return true;
        }
        return false;
    }


}
