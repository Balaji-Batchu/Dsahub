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
    public static int sumHelper(TreeNode root, int sum, String type){
        if(root == null){
            return 0;
        }

        if((root.left == null && root.right == null) && (type.equals("left"))){
            sum += root.val;
        }

        if(root.left != null){
            sum = sumHelper(root.left, sum, "left");
        }
        if(root.right != null){
            sum = sumHelper(root.right, sum, "right");
        }
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return sumHelper(root, 0, "root");
    }
}