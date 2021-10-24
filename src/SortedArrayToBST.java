public class SortedArrayToBST {


    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = fill(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode fill(int[] nums, int i, int j) {
        TreeNode node = new TreeNode();
        if (i > j)
            return null;
        int m = (i + j) / 2;
        node.val = nums[m];
        node.left = fill(nums, i, m - 1);
        node.right = fill(nums, m + 1, j);
        return node;
    }


}
