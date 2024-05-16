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
    public int maxDepth(TreeNode root) {
        List<TreeNode> dq = new ArrayList<>();
        if(root != null) dq.add(root);
        int count = 0;

        while(!dq.isEmpty()){
            int k = dq.size();
            count ++;
            for(int temp = 0; temp < k; temp ++){
                TreeNode curr = dq.remove(0);
                if(curr.left != null) dq.add(curr.left);
                if(curr.right != null) dq.add(curr.right);
            }
        }
        return count;
    }
}