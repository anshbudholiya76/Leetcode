class Solution {
    public int minimumDeletions(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        int minIndex = -1;
        int maxIndex = -1;

        // Find first occurrence of min and max
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == min && minIndex == -1) {
                minIndex = i;
            }

            if (nums[i] == max && maxIndex == -1) {
                maxIndex = i;
            }
        }

        int left = Math.max(minIndex, maxIndex) + 1;

        int right = nums.length - Math.min(minIndex, maxIndex);

        int both = Math.min(minIndex, maxIndex) + 1
                 + nums.length - Math.max(minIndex, maxIndex);

        return Math.min(left, Math.min(right, both));
    }
}