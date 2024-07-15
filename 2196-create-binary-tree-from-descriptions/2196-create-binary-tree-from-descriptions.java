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

    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> nodeMap = new HashMap<>();

        HashSet<Integer> children = new HashSet<>();

        for (int[] desc : descriptions) {
            int parent = desc[0];
            int child = desc[1];
            int isLeft = desc[2];

            if (!nodeMap.containsKey(parent)) {
                nodeMap.put(parent, new TreeNode(parent));
            }
            if (!nodeMap.containsKey(child)) {
                nodeMap.put(child, new TreeNode(child));
            }

            if (isLeft == 1) {
                nodeMap.get(parent).left = nodeMap.get(child);
            } else {
                nodeMap.get(parent).right = nodeMap.get(child);
            }

            children.add(child);
        }

        for (TreeNode node : nodeMap.values()) {
            if (!children.contains(node.val)) return node;
        }

        return null;
    }
}
