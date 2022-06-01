/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode ans;
    private boolean recurTree(TreeNode cur, TreeNode p, TreeNode q){
        if(cur == null){
            return false;
        }
        int left = recurTree(cur.left, p, q)? 1:0;
        int right = recurTree(cur.right, p, q)? 1:0;
        int mid = (cur == p || cur == q) ? 1:0;
        
        if(left+right+mid>=2){
            this.ans = cur;
        }
        return (left+right+mid > 0);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.recurTree(root, p, q);
        return this.ans;
    }
}