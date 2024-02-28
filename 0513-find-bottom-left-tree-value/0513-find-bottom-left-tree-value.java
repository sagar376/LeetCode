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
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> q=new ArrayDeque<TreeNode>();
        q.add(root);
        TreeNode curr=root;
        while(!q.isEmpty())
        {
            curr=q.pop();
            if(curr.right!=null)
            q.add(curr.right);
            if(curr.left!=null)
            q.add(curr.left);

        }
        return curr.val;
        
    }
}