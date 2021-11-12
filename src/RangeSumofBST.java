public class RangeSumofBST {

   /* int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root!=null){
            rangeSumBST(root.left, low, high);
            sum=sum+((root.val>= low && root.val<=high) ? root.val : 0);
            rangeSumBST(root.right, low, high);
        }
        return sum;
    }*/

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
            return 0;
        if(root.val<low)
            return rangeSumBST(root.right, low, high);
        if(root.val>high)
            return rangeSumBST(root.left, low, high);
        return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }

}
