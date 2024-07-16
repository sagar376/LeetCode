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
    public String getDirections(TreeNode root, int startValue, int destValue) {

        StringBuilder findStart = new StringBuilder();
        StringBuilder findDest = new StringBuilder();

        dfs(root,startValue,findStart);
        dfs(root,destValue,findDest);

        int i=0;
        while(i<findStart.length() && i<findDest.length() && findStart.charAt(i)==findDest.charAt(i))
        {
            i++;
        }

        StringBuilder directions = new StringBuilder();
        for(int j=i;j<findStart.length();j++)
        {
            directions.append("U");
        }

        directions.append(findDest.substring(i));
        
        return directions.toString();
    }

    private boolean dfs(TreeNode root,int value,StringBuilder string)
    {
        if(root == null)
        {
            return false;
        }
        if(root.val == value)
        {
            return true;
        }
        string.append("L");
        if(dfs(root.left, value, string))
        return true;
        string.deleteCharAt(string.length()-1);
        
        string.append("R");
        if(dfs(root.right, value, string))
        return true;
        string.deleteCharAt(string.length()-1);
        return false;
    }
}