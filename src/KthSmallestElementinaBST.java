public class KthSmallestElementinaBST {



    public int s=1;
    public int res=0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return res;
    }

    public void inorder(TreeNode root, int k){
        if(root!=null){
            inorder(root.left, k);
            //System.out.println(root.val);
            if(s==k){
                res=root.val;
                //System.out.println("xx"+res);
            }
            s++;
            inorder(root.right, k);
        }
    }



}
