import java.util.*;

public class BinaryTree {


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

    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level=new ArrayList<>();
            for(int i=0; i<queue.size(); i++){
                TreeNode x=queue.poll();
                level.add(x.val);
                if(x.right!=null)
                    queue.add(x.right);
                if(x.left!=null)
                    queue.add(x.left);
            }
            list.add(level);
            level.clear();
        }
        return list;
    }

    public void iterative_inorder(TreeNode root){

        Stack<TreeNode> stack=new Stack<>();
        if(root==null)
            return;
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            //
            root=root.right;
        }
    }




    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root, res);
        return res;
    }
    public void inorder(TreeNode node, List<Integer> list){
        if(node!=null){
            inorder(node.left, list);
            list.add(node.val);
            inorder(node.right, list);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode node, List<Integer> list){
        if(node==null)
            return;
        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int s=queue.size();
            for(int i=0; i<s; i++){
                TreeNode curr=queue.remove();
                level.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            list.add(level);
        }
        return list;
    }

    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public boolean isSymmetric(TreeNode root) {
        return (root==null);
    }
    public boolean check(TreeNode L, TreeNode R){
        if(L==null && R==null)
            return true;
        if(L!=null && R!=null){
            return (L.val==R.val) && check(L.left,R.right) && check(L.right, R.left);
        }
        return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root!=null){
            targetSum-=root.val;
            if(targetSum==0 && root.right==null && root.left==null)
                return true;
            else if(targetSum!=0 && root.right==null && root.left==null)
                return false;
        }
        if(root==null)
            return false;
        return (hasPathSum(root.left, targetSum)
                || hasPathSum(root.right, targetSum));
    }

    //LCA
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
                return null;
        if(root.val==p.val || root.val==q.val)
            return root;
        TreeNode x=lca(root.left, p, q);
        TreeNode y=lca(root.right, p, q);
        if(x!=null && y!=null)
            return root;
        if(x==null && y==null)
            return null;
        else return (x!=null) ? x : y;
    }

}
