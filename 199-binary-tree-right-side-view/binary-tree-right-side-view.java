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
        TreeMap<Integer, Integer> map = new TreeMap<>();
        preOrder(root, map, 0);

        // System.out.println(map);
        return new ArrayList<>(map.values());
    }

    public static void preOrder(TreeNode root, TreeMap<Integer, Integer> map, int level) {
        if(root == null) return;

        map.put(level, root.val);
        preOrder(root.left, map, level + 1);
        preOrder(root.right, map, level + 1);
    }
}

class Node{
    TreeNode root;
    int level;

    Node(TreeNode root, int level){
        this.root = root;
        this.level = level;
    }
}