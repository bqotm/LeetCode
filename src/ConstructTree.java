import java.util.stream.IntStream;

public class ConstructTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public int search(int arr[], int strt, int end, int value) {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

    public int preIndex=0;

    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        if(inorder.length==0)
            return null;
        TreeNode node=new TreeNode(preorder[preIndex++]);
        int l=searchIndex1(inorder, node.val);
        int[] leftSlice=IntStream.range(0,l)
                .map(i -> inorder[i])
                .toArray();
        if(leftSlice.length==0)
            return null;
        int[] rightSlice=IntStream.range(l+1,inorder.length)
                .map(i -> inorder[i])
                .toArray();
        if(rightSlice.length==0)
            return null;
        if(leftSlice.length==0 && rightSlice.length==0)
            return node;
        node.left=buildTree1(preorder,leftSlice);
        node.right=buildTree1(preorder,rightSlice);
        return node;
    }

    public static int searchIndex1(int[] arr, int element){
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i]==element)
                .findFirst()
                .orElse(-1);
    }

    private int postIndex;

    public TreeNode buildTree2(int[] inorder, int[] postorder) {
        postIndex=postorder.length-1;
        return buildTree22(inorder, postorder,0, postIndex);
    }

    public TreeNode buildTree22(int[] inorder, int[] postorder, int start, int end){
        if(start>end || postIndex<0)
            return null;
        TreeNode node=new TreeNode(postorder[postIndex--]);
        int l=searchIndex(inorder, node.val, start, end+1);

        node.right=buildTree22(inorder, postorder, l+1, end );
        node.left=buildTree22(inorder, postorder, start, l-1);
        return node;
    }

    public static int searchIndex(int[] arr, int element,int start, int end){
        return IntStream.range(start, end)
                .filter(i -> arr[i]==element)
                .findFirst()
                .orElse(-1);
    }

}
