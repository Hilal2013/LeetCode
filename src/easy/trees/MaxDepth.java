package easy.trees;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left == null && root.right == null) return 1;

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));

    }
}
/*
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */