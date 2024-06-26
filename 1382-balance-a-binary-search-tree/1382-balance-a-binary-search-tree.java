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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> bstList=new ArrayList<>();

        converBSTToArray(root,bstList);

        // for(int i=0;i<bstList.size();i++)
        // {
        //     System.out.println(bstList.get(i));
        // }

        root=solve(0,bstList.size()-1,bstList);
        return root;
    }
    private void converBSTToArray(TreeNode root,List<Integer> bstList)
    {
        if(root==null)
        return;

        converBSTToArray(root.left,bstList);
        bstList.add(root.val);
        converBSTToArray(root.right,bstList);
    }
    private TreeNode solve(int l,int r,List<Integer> bstList)
    {
        if(l>r)
        return null;

        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(bstList.get(mid));
        root.left=solve(l,mid-1,bstList);
        root.right=solve(mid+1,r,bstList);
        return root;
    }
}