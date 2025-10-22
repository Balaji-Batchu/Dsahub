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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        search(root, root.val + "", paths);
        return paths;
    }

    private void search(TreeNode root, String existingPath, List<String> paths) {
        if(root.left == null && root.right == null) {
            paths.add(existingPath);
            return;
        }

        if(root.left != null) search(root.left, existingPath + "->" + root.left.val, paths);
        if(root.right != null) search(root.right, existingPath + "->" + root.right.val, paths);
    }
}