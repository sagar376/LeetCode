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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Queue<TreeNode> level=new LinkedList<>();
        
        if(root==null)
        return result;
        
        level.offer(root);
        while(!level.isEmpty())
        {
            int size=level.size();
            for(int i=0;i<size;i++)
            {
                TreeNode cur=level.poll();
                if(i==0)result.add(cur.val);
                if(cur.right!=null)level.offer(cur.right);
                if(cur.left!=null)level.offer(cur.left);
            }
        }
        return result;
        
    }
}