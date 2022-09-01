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
    int max = -3001;
    
    public int maxPathSum(TreeNode root) {
        work(root);
        return max;
    }
    
    public int work(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(work(root.left), 0);
        int right = Math.max(work(root.right), 0);
        max = Math.max(max, left + right + root.val);
        
        return root.val + Math.max(left, right);
    }
}