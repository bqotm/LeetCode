public class BinaryTreeTilt {


    public int findTilt(TreeNode root) {
        if(root==null)
            return 0;
        int s=0;
        s+=Math.abs(sumNode(root.left)-sumNode(root.right));
        s+=findTilt(root.left);
        s+=findTilt(root.right);
        return s;
    }

    public int sumNode(TreeNode node){
        if(node==null)
            return 0;
        return node.val+sumNode(node.left)+sumNode(node.right);
    }



}
