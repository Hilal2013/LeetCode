package easy.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static  List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list =new ArrayList<>();
        inOrder(root,list); //call this method
        return list;



    }
    public static void inOrder(TreeNode root,List<Integer> list){
//left-root-right
        if (root == null) return ; //termination

        inOrder(root.left,list);//branch left subtree
     list.add(root.val); //visit root and add
        inOrder(root.right,list);//branch right subtree


    }
    public static List<Integer> inorderTraversalStack(TreeNode root) {
//left-root-right

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();// last in first out
        TreeNode current=root;
        while(current!=null|| !stack.empty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            list.add(current.val);
            current = current.right;

        }
return list;

    }


}
/*
Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 */