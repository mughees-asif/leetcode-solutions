import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}

/*    maxDepth()
        1. If tree is empty then return 0
        2. Else
            (a) Get the max depth of left subtree recursively  i.e.,
                call maxDepth( tree->left-subtree)
            (b) Get the max depth of right subtree recursively  i.e.,
                call maxDepth( tree->right-subtree)
            (c) Get the max of max depths of left and right
                subtrees and add 1 to it for the current node.
                max_depth = max(max dept of left subtree,
                max depth of right subtree)
                + 1
        (d) Return max_depth
*/

/*   Example:-
            maxDepth('1') = max(maxDepth('2'), maxDepth('3')) + 1
                = 2 + 1
                /    \
                /         \
                /             \
                /                 \
                /                     \
        maxDepth('2') = 1                maxDepth('3') = 1
                = max(maxDepth('4'), maxDepth('5')) + 1
                = 1 + 1   = 2
                /    \
                /        \
                /            \
                /                \
                /                    \
                maxDepth('4') = 1     maxDepth('5') = 1
*/
