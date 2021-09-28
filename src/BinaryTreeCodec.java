import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCodec {

    public static class TreeNode {
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

    public static class Codec {

        // Encodes a tree to a single string.
        public static String serialize(TreeNode root) {

            StringBuilder serial=new StringBuilder();
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int s=queue.size();
                for(int i=0; i<s; i++){
                    TreeNode curr=queue.remove();
                    serial.append(Integer.toString(curr.val));
                    if(curr.left!=null){
                        queue.add(curr.left);
                    }
                    if(curr.right!=null){
                        queue.add(curr.right);
                    }
                }
            }
            return serial.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {

            return null;
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        TreeNode root1=new TreeNode(1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);
        root1.right.left=new TreeNode(4);
        root1.right.right=new TreeNode(5);

        System.out.println(Codec.serialize(root1));
    }

}
