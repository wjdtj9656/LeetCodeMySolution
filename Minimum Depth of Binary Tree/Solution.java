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
    static int min;
    public int minDepth(TreeNode root) {
        TreeNode cur = root;
        min = (int)10e9;
        if(cur != null)
        dfs(cur,1);
        else return 0;
        return min;
    }
    public void dfs(TreeNode node, int cnt){
        if(node.left == null && node.right == null){
            min = Math.min(cnt,min);
        }
        if(node.left != null){
            dfs(node.left, cnt+1);
        }
        if(node.right != null){
            dfs(node.right, cnt+1);
        }
    }
}