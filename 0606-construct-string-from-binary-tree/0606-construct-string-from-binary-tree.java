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
    public String tree2str(TreeNode root) {
        
        StringBuilder result=new StringBuilder();
        DFS(root,result);
        return result.toString().substring(1,result.length()-1);
        
    }
    
    void DFS(TreeNode root,StringBuilder result)
    {
        if(root==null)
        {
            return;
        }
        
        result.append("(");
        result.append(root.val);
        if(root.left==null && root.right!=null){
            result.append("()");
        }
        DFS(root.left,result);
        DFS(root.right,result);
        result.append(")");
        
    }
}
