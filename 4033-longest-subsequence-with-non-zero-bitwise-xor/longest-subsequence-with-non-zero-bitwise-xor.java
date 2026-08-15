class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        if (xor != 0) {
            return nums.length;
        }

        // Total XOR is 0.
        // Remove one non-zero element to make XOR non-zero.
        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }

        // All elements are 0.
        return 0;
    }
}