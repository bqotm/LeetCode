public class BalancedBinaryTree {


    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int l=Math.abs(height(root.right)-height(root.left));
        boolean leftSub=isBalanced(root.left);
        boolean rightSub=isBalanced(root.right);
        if(l<=1 && leftSub && rightSub)
            return true;
        return false;
    }

    public int minHeight(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int leftMin=root.left!=null ? minHeight(root.left) : Integer.MAX_VALUE;
        int rightMin=root.right!=null ? minHeight(root.right) : Integer.MAX_VALUE;
        return 1+Math.min(leftMin,rightMin);
    }

    public int maxHeight(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int leftMax=root.left!=null ? maxHeight(root.left) : Integer.MIN_VALUE;
        int rightMax=root.right!=null ? maxHeight(root.right) : Integer.MIN_VALUE;
        return 1+Math.max(leftMax,rightMax);
    }

    public int height(TreeNode root){
        if(root==null)
            return -1;
        return 1+Math.max(height(root.left), height(root.right));
    }


}
