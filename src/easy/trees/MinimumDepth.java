package easy.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepth {

    class Solution {
        public int minDepth(TreeNode root) {
         //if root is null
            if (root == null) return 0;
            // if root has no children
            if(root.left == null && root.right == null) return 1;
            else if(root.left==null)return 1+minDepth(root.right);
            else if(root.right==null)return 1+minDepth(root.left);

            return 1+Math.min(minDepth(root.left),minDepth(root.right));        }
    }

}
/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int depth = 1; //level 1;

            while (!queue.isEmpty()) {
                TreeNode toVisit = queue.poll();//remove first
                if (toVisit.left == null && toVisit.right == null) return depth;
                else {
                    if (toVisit.left != null) {
                        queue.add(toVisit.left);
                    }
                    if (toVisit.right != null) {
                        queue.add(toVisit.right);
                    }
                }
                depth++;
            }
return depth;
 */