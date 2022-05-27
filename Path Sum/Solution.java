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
    static boolean result;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        TreeNode cur = root;
        if(cur == null) return false;
        result = false;
        dfs(cur,0,targetSum);
        return result;
    }
    public void dfs(TreeNode node,int sum, int targetSum){
        if(node.left == null && node.right == null){
            sum+= node.val;
            if(sum == targetSum) result = true;
            else sum -= node.val;
        }
        if(node.left != null){
            sum += node.val;
            dfs(node.left,sum,targetSum);
            sum -= node.val;
        }
        if(node.right != null){
            sum += node.val;
            dfs(node.right,sum,targetSum);
            sum -= node.val;
        }
    }
}