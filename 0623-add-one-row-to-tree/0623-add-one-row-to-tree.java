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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root == null)
        {
            return null;
        }

        if(depth == 1)
        {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        return add(root,val,depth,1);
        
    }

    private TreeNode add(TreeNode root,int val,int depth,int curr)
    {
        if(root==null)
        {
            return null;
        }

        if(curr == depth-1)
        {
            TreeNode lnode=root.left;
            TreeNode rnode=root.right;

            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            root.left.left=lnode;
            root.right.right=rnode;

            return root;
        }

        root.left=add(root.left,val,depth,curr+1);
        root.right=add(root.right,val,depth,curr+1);

        return root;
    }
}