public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
        this.left=this.right=null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        else if(val>root.val){
            root.right=insertIntoBST(root.right, val);
        } else if(val<root.val){
            root.left=insertIntoBST(root.left, val);
        }
        return root;
    }


}
