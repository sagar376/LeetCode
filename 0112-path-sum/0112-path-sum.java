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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum,0);
        
    }

    private boolean dfs(TreeNode curr,int targetSum,int currentSum)
    {
        if(curr==null)
        {
            return false;
        }
        currentSum=currentSum+curr.val;
        if(curr.left==null && curr.right==null)
        {
            if(currentSum==targetSum)
            return true;
            else 
            return false;
        }
        boolean left=dfs(curr.left,targetSum,currentSum);
        boolean right=dfs(curr.right,targetSum,currentSum);
        return left || right;
    }
}