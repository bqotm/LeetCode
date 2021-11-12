public class RangeSumofBST {

    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root!=null){
            rangeSumBST(root.left, low, high);
            sum=sum+((root.val>= low && root.val<=high) ? root.val : 0);
            rangeSumBST(root.right, low, high);
        }
        return sum;
    }

}
