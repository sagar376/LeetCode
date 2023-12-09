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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<Integer>();
        
        DFS(root,answer);    
        return answer;
        
        
    }
    public void DFS(TreeNode root,List<Integer> answer)
    {
        if(root==null)
        {
            return;
        }
        
        DFS(root.left,answer);
        answer.add(root.val);
        DFS(root.right,answer);
    }
}