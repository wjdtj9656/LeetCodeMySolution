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
    static LinkedList<Integer> list;
    public void recur(TreeNode node){
      if(node == null) return;
      recur(node.left);
      recur(node.right);
      list.add(node.val);
    }
  
    public List<Integer> postorderTraversal(TreeNode root) {
      list = new LinkedList<>();
      recur(root);
      return list;
    }
}