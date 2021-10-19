import java.util.ArrayList;
import java.util.List;

public class InorderSucc_Pres {



    /*
    *   find inorder & predecessor of val in bst
    *
    *
    *
    *
    * */
    public static int inorder_successor(TreeNode root, int val){
        TreeNode node=root;
        while(node.val!=val){
            if(node.val>val){
                node=node.left;
            } else if(node.val<val){
                node=node.right;
            }
        }
        if(node.right!=null){
            TreeNode successor=node.right;
            while(successor.left!=null){
                successor=successor.left;
            }
            return successor.val;
        }
        TreeNode fetch=root, succ=root;
        while(fetch.val!=val){
            if(val<fetch.val){
                succ=fetch;
                fetch=fetch.left;
            } else if(val>fetch.val){
                fetch=fetch.right;
            }
        }
        return succ.val;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(5);
        root=TreeNode.insertIntoBST(root, 2);
        root=TreeNode.insertIntoBST(root, 6);
        root=TreeNode.insertIntoBST(root, 7);
        root=TreeNode.insertIntoBST(root, 1);
        root=TreeNode.insertIntoBST(root, 4);
        root=TreeNode.insertIntoBST(root, 3);
        //TreeNode.inorder(root);
        System.out.println("*************");
        System.out.println(inorder_successor(root, 3));




    }
}
