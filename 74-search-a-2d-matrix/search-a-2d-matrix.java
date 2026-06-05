class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {

            if (mat[i][0] <= target && target <= mat[i][n - 1]) {

                int low = 0;
                int high = n - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (mat[i][mid] == target) {
                        return true;
                    } else if (mat[i][mid] < target) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                return false;
            }
        }

        return false;
    }
}