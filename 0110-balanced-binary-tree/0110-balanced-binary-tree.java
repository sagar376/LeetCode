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
    
    //TOP-DOWN approach O(n^2) time complexity
//     public boolean isBalanced(TreeNode root) {
        
//         if(root==null)return true;
        
//         if(Math.abs(height(root.left)-height(root.right)) > 1)return false;
        
//         return isBalanced(root.left) && isBalanced(root.right);
        
//     }
    
//     public int height(TreeNode root){
//         if(root==null)return 0;
        
//         return 1+Math.max(height(root.left),height(root.right));
//     }
    
    
    //Bottom Up approach
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)return true;
        
        return height(root) !=-1;
        
    }
    
    public int height(TreeNode node)
    {
      
        if(node==null) return 0;
        
        int left=height(node.left);
        int right=height(node.right);
        int bf=Math.abs(left-right);

        System.out.println("node "+node.val+" left: "+left+" right: "+right);

        if(bf>1 || left==-1 || right==-1) return -1;

        return 1+Math.max(left,right);
    }
    
}