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
    public int countPairs(TreeNode root, int distance) {

        List<String> paths = new ArrayList<>();
        int result = 0;

        StringBuilder currPath=new StringBuilder();
        dfs(root,paths,currPath);

        for(int i=0;i<paths.size()-1;i++)
        {
            for(int j=i+1;j<paths.size();j++)
            {
                int prefixLen = 0;
                int k=0;
                while(paths.get(i).length() > k && paths.get(j).length() > k && paths.get(i).charAt(k)==paths.get(j).charAt(k) )
                {
                    prefixLen++; k++;
                }
                

                if(paths.get(i).length() + paths.get(j).length() - 2 * prefixLen <= distance) 
                result++;
            }
        }
        return result;
        
    }

    private void dfs(TreeNode root,List<String> paths,StringBuilder currPath)
    {
        if(root == null)
        return;

        if(root.left == null && root.right == null)
        {
            paths.add(currPath.toString());
            return;
        }
        
        currPath.append("L");
        dfs(root.left,paths,currPath);
        currPath.setLength(currPath.length()-1);

        currPath.append("R");
        dfs(root.right,paths,currPath);
        currPath.setLength(currPath.length()-1);

    }
    
}