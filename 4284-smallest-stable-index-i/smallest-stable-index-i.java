class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int ans = -1;
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            mx = Math.max(mx, nums[i]);

            int mn = Integer.MAX_VALUE;

            for (int j = i; j < nums.length; j++) {
                mn = Math.min(mn, nums[j]);
            }

            if (mx - mn <= k) {
                ans = i;
                break;
            }
        }

        return ans;
    }
}