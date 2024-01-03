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
//Solution-1
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

    for(int i = 0; i < inorder.length; i++) {
        inMap.put(inorder[i], i);
    }

    TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
    return root;
}

public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
    if(preStart > preEnd || inStart > inEnd) return null;

    TreeNode root = new TreeNode(preorder[preStart]);
    int inRoot = inMap.get(root.val);
    int numsLeft = inRoot - inStart;

    root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
    root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

    return root;
}
}


//Solution-2
// class Solution {
//     public TreeNode buildTree(int[] preorder, int[] inorder) {
        
//         if(preorder.length==0 || inorder.length==0)return null;
        
//         int mid=0;
//         for(int i=0;i<preorder.length;i++){
//             if(preorder[0]==inorder[i])
//             {
//                 mid =i;
//             }
//         }
        
//         TreeNode root=new TreeNode(preorder[0]);
//         root.left=buildTree(Arrays.copyOfRange(preorder,1,mid+1),Arrays.copyOfRange(inorder,0,mid));
//         root.right=buildTree(Arrays.copyOfRange(preorder,mid+1,preorder.length),Arrays.copyOfRange(inorder,mid+1,inorder.length));
        
//         return root;
        
        
//     }
// }