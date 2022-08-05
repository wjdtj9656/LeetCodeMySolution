/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var findLeaves = function(root) {
    let arr = [];
    (function dfs(node){
      if(!node) return -1;
      let left = dfs(node.left);
      let right = dfs(node.right);
      let height = Math.max(left,right)+1;
      if(!arr[height]) arr[height] =[];
      arr[height].push(node.val);
      return height;
    })(root);
  return arr;
};