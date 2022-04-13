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
    static int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        TreeNode cur = root;
        maxDepth = 0;
        if(root == null) return 0;
        dfs(cur,1);
        return maxDepth;
    }
    public void dfs(TreeNode node,int depth){
        maxDepth = Math.max(depth,maxDepth);
        if(node.left != null){
            dfs(node.left,depth+1);
        }
        if(node.right != null){
            dfs(node.right,depth+1);
        }
    }
}