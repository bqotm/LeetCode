public class DiameterOfBinaryTree {



    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int lheight=maxDepth(root.left);
        int rheight=maxDepth(root.right);
        int ldiameter=diameterOfBinaryTree(root.left);
        int rdiameter=diameterOfBinaryTree(root.right);
        int d=Math.max(lheight+rheight, Math.max(ldiameter, rdiameter));
        return d;

    }

    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }


}
