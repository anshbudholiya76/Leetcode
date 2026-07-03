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
    public void traver(TreeNode root,List<Integer> trav){
        if(root == null){
            return;
            }
        traver(root.left,trav);
        trav.add(root.val);
        traver(root.right,trav);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> trav = new ArrayList<>();
        traver(root,trav);
        return trav;
    }
}