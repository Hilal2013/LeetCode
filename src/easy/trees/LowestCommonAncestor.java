package easy.trees;

public class LowestCommonAncestor {
    public TreeNode iterativeSolution(TreeNode root, TreeNode p, TreeNode q) {

        int small=Math.min(p.val,q.val);
        int large=Math.max(p.val,q.val);
        while(root!=null){
            if(root.val>large){//if root value >bigger than p and q // p,q belong to the left subtree
               root=root.left;
            }else if(root.val<small){//if root.value< p and q; p,q belong to the right subtree
root=root.right;
            }else return root;
        }

       return null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // If the root is null
        if(root == null){
            return null;
        }
       // a node can be a descendant of itself according to the LCA definition
        if(root==q || root==p) return root;
        if(root.val<q.val && root.val>p.val) return root;//root val between q.val and p.val//means it is parent
        //if p and q values less then root values means left
        if(root.val>q.val && root.val>p.val) return lowestCommonAncestor(root.left,p,q);
//if p and q values greater then root values means right
        if(root.val<q.val && root.val<p.val) return lowestCommonAncestor(root.right,p,q);

        return root;
    }

}
/*
Given a binary search tree (BST),
find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia:
 “The lowest common ancestor is defined between
 two nodes p and q as the lowest node in T that has both p and q as descendants
 (where we allow a node to be a descendant of itself).”


Constraints:

The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the BST.
 */