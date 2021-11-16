public class SumRoottoLeafNumbers {


    public int sumNumbers(TreeNode root) {
        return _sumNumbers(root, "");
    }

    public int _sumNumbers(TreeNode root, String num){
        int sum=0;
        if(root==null)
            return 0;
        if(root.left==null && root.right==null){
            num+=Integer.toString(root.val);
            return Integer.parseInt(num);
        }
        else{
            num+=Integer.toString(root.val);
        }
        sum+=_sumNumbers(root.left, num);
        sum+=_sumNumbers(root.right, num);
        return sum;
    }




}
