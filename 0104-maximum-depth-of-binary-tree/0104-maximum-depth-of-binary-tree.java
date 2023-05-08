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
    int depth;
    int left;
    int right;
    int max;
    public int maxDepth(TreeNode root) {
        if (root == null) return depth;    
        depth++;
        left = maxDepth(root.left);
        right = Math.max(left, maxDepth(root.right));
        depth--;
        max = Math.max(max, right);
        return max;
    }
}