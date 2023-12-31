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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> list=new LinkedList<>();
        
        if(root==null)return result;
        list.add(root);
        while(!list.isEmpty())
        {
            int size=list.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=list.poll();
                level.add(curr.val);
                if(curr.left!=null)
                {
                    list.add(curr.left);
                }
                if(curr.right!=null)
                {
                    list.add(curr.right);
                }
            }
            result.add(level);
        }
        
        return result;
        
    }
}