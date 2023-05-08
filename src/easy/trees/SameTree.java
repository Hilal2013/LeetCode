package easy.trees;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null || p != null && q == null) {
            return false;
        }
        if (p == null && q == null) {

            return true;
        }
        if(p.val != q.val){
            return false;
        }
// Recursively compare the left and right subtrees of the two trees
        // If both subtrees are the same, the two trees are the same
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

}
/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
Input: p = [1,2,3], q = [1,2,3]
Output: true
Input: p = [1,2,1], q = [1,1,2]
Output: false
Input: p = [1,2], q = [1,null,2]
Output: false
 */