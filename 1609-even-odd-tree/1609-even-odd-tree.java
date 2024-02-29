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
    public boolean isEvenOddTree(TreeNode root) {
        // if(root==null)
        // return true;
        Queue<TreeNode> q=new LinkedList<>();
        boolean evenLevel=true;
        q.add(root);

        while(q.size() > 0)
        {
            int size=q.size();
            int prev=evenLevel?Integer.MIN_VALUE:Integer.MAX_VALUE;
            while(size -- > 0)
            {
                root =q.poll();
                if(evenLevel && (root.val %2 ==0 || root.val <= prev))
                return false;
                if(!evenLevel && (root.val % 2 ==1 || root.val >= prev))
                return false;

                if(root.left !=null)
                q.add(root.left);
                if(root.right!=null)
                q.add(root.right);
                prev=root.val;
            }
            evenLevel = !evenLevel;
        }
        return true;
    }
}