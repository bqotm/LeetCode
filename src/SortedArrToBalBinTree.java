public class SortedArrToBalBinTree {

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

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        TreeNode root = helper(nums, 0, nums.length-1);
        return root;
    }

    public TreeNode helper(int[] nums, int low, int high){
        if(low>=high)
            return null;
        int m=(low+high)/2;
        TreeNode node=new TreeNode(nums[m]);
        node.right=helper(nums,low,m);
        node.left=helper(nums,m+1, high);
        return node;
    }
}
