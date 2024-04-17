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
    public String smallestFromLeaf(TreeNode root) {

        String smallestString="";
        return dfs(root,smallestString,"");
        
    }

    private String dfs(TreeNode curr,String smallestString,String path)
    {
        if(curr==null)
        return smallestString;

        //path=curr.val+path;
        path=(char)(curr.val+'a') + path;

        if(curr.left==null && curr.right == null)
        {
            //System.out.println(path);
            if(smallestString.isEmpty() || smallestString.compareTo(path) > 0 )
            {
                smallestString=path;
            }
            return smallestString;

        }

         smallestString= dfs(curr.left,smallestString,path);
        smallestString= dfs(curr.right,smallestString,path);
        return smallestString;
    }
}