package easy.trees;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        // If the tree is empty=>balanced
        if (root == null)  return true;
        if (Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left)
                && isBalanced(root.right))
            return true;
return false;
    }

    public int height(TreeNode root) {

        if (root == null)  return 0;
        if(root==null) return 0;
        if(root.left == null && root.right == null) return 1;

        return 1+Math.max(height(root.left),height(root.right));
    }
}
/*
Input: root = [3,9,20,null,null,15,7]
Output: true
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Input: root = []
Output: true
 */