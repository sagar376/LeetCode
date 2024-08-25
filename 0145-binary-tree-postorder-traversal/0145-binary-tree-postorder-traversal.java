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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> pot = new ArrayList<>();

        post(root, pot);

        return pot;
        
    }

    private void post(TreeNode root, List<Integer> pot){
        if(root == null)
        {
            return;
        }

        post(root.left, pot);

        post(root.right, pot);

        pot.add(root.val);

    }
}