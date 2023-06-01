package easy.trees;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null || p != null && q == null) {
            return false;
        }
        if (p == null && q == null) {

            return true;
        }
        if (p.val != q.val) {
            return false;
        }
// Recursively compare the left and right subtrees of the two trees
        // If both subtrees are the same, the two trees are the same
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public boolean isSameTreeIterative(TreeNode p, TreeNode q) {

        Queue<TreeNode> queQ = new LinkedList<>();
        Queue<TreeNode> queP = new LinkedList<>();

        queP.add(p);
        queQ.add(q);//adding last //for deque addLast offerLast

        while (!queQ.isEmpty()) {
     TreeNode pNode= queP.remove();//remove first element
            TreeNode qNode = queQ.poll();
            if ((pNode != null && qNode == null) || (pNode == null && qNode != null) || (pNode!= null && qNode != null && pNode.val != qNode.val))
                return false;
            else if (pNode!= null && qNode != null && pNode.val == qNode.val) {
                queP.add(pNode.left);
                queP.add(pNode.right);
                queQ.add(qNode.left);
                queQ.add(qNode.right);
            }
        }
        return true;
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