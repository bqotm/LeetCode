import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceinBST {


    public int getMinimumDifference(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root, list);
        int diff=Integer.MAX_VALUE;
        for(int i=0; i<list.size()-1; i++){
            if(Math.abs(list.get(i)-list.get(i+1))<diff)
                diff=Math.abs(list.get(i)-list.get(i+1));
        }
        return diff;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if(root==null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    /*

    public int getMinimumDifference(TreeNode root) {
        Integer x = null;
        Integer diff = Integer.MAX_VALUE;
        inorder(root, x, diff);
        return diff;
    }

    public void inorder(TreeNode root, Integer x, Integer diff) {
        if (root != null) {
            inorder(root.left, x, diff);
            if (x == null) {
                x = root.val;
                System.out.println("xx");
            } else {
                if (diff > Math.abs(root.val - x)) {
                    diff = Math.abs(root.val - x);
                }
                x = root.val;
            }
            System.out.println(root.val + " " + diff + " " + x + " " + Math.abs(root.val - x));
            inorder(root.right, x, diff);
        }
    }
    */

}
