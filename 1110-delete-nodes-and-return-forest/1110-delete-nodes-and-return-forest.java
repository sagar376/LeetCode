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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<to_delete.length;i++)
        {
            set.add(to_delete[i]);
        }

        List<TreeNode> forest = new ArrayList<>();

        root = processNode(root, set, forest);

        if(root != null)
        {
            forest.add(root);
        }

        return forest;
        
    }

    private TreeNode processNode(TreeNode root, HashSet<Integer> set, List<TreeNode> result)
    {
        if(root == null)
        return null;

        root.left = processNode(root.left, set, result);
        root.right = processNode(root.right, set , result);

        if(set.contains(root.val))
        {
            if(root.left != null)
            result.add(root.left);

            if((root.right != null))
            result.add(root.right);

            return null;
        }

        return root;
    }
}