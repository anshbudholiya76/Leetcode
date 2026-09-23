class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {

        // Both are null → symmetric
        if (left == null && right == null) {
            return true;
        }

        // One is null → not symmetric
        if (left == null || right == null) {
            return false;
        }

        // Values must be same
        if (left.val != right.val) {
            return false;
        }

        // Check mirror positions
        return check(left.left, right.right) &&
               check(left.right, right.left);
    }
}