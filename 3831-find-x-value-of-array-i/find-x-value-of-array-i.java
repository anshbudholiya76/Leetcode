class Solution {
    public long[] resultArray(int[] nums, int k) {
          long[] result = new long[k];
        long[] dp = new long[k]; // dp[r] = # subarrays ending at previous index with product % k == r

        for (int num : nums) {
            long[] newDp = new long[k];
            int a = num % k;

            // extend all previous subarrays by nums[i]
            for (int r = 0; r < k; r++) {
                if (dp[r] == 0) continue;
                int nr = (r * a) % k;
                newDp[nr] += dp[r];
            }            // new subarray consisting of nums[i] alone
            newDp[a] += 1;

            dp = newDp;

            for (int r = 0; r < k; r++) {
                result[r] += dp[r];
            }
        }

        return result;

    }
}