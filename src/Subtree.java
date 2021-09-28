public class Subtree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
            return false;
        TreeNode x=root;
        while(x.val!=subRoot.val){
            if(x.val<subRoot.val)
                x=x.right;
            if(x.val>subRoot.val)
                x=x.left;
        }
        return check(x, subRoot);
    }

    public boolean check(TreeNode tree1, TreeNode tree2){
        if(tree1==null && tree2==null)
            return true;
        if(tree1.val!=tree2.val)
            return false;
        return check(tree1.left, tree2.left) && check(tree1.right, tree2.right);
    }
}
