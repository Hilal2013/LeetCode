package easy.trees;

import java.util.Stack;

public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (root == null) return 0; //termination//base condition
        if (root.val > low) rangeSumBST(root.left, low, high);//branch left
        if (root.val >= low && root.val <= high)
            sum += root.val;
        if (root.val < high)rangeSumBST(root.right, low, high);

        return sum;

//time C.=>O(n) space C.=>O(n)
    }

    public int rangeSumBSTStack(TreeNode root, int low, int high) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int sum = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val >= low && node.val <= high) {
                sum += node.val;
            }

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }

        }
        return sum;
//time C.=>O(n) space C.=>O(n)

    }

}
/*
Given the root node of a binary search tree and two integers low and high,
 return the sum of values of all nodes with a value in the inclusive range [low, high].
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.


Constraints:

The number of nodes in the tree is in the range [1, 2 * 104].
1 <= Node.val <= 105
1 <= low <= high <= 105
All Node.val are unique.



 */