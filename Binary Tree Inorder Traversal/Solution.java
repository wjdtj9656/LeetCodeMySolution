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
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         TreeNode cur = root;
//         ArrayList<Integer> list = new ArrayList<>();
//         Stack<TreeNode> stack = new Stack<>();
//         while(cur != null || !stack.isEmpty()){
//             while(cur != null){
//                 stack.push(cur);
//                 cur = cur.left;
//             }
//             cur = stack.pop();
//             list.add(cur.val);
//             cur = cur.right;
//         }
//         return list;
//     }
// }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
