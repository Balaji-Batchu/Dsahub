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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preOrder(root, ans, 0);
        return ans;
    }

    public static void preOrder(TreeNode root, List<Integer> list, int level) {
        if(root == null) return;

        if(list.size() == level)
            list.add(root.val);
        preOrder(root.right, list, level + 1);
        preOrder(root.left, list, level + 1);
    }
}
