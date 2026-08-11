class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        // Find the longest consecutive prefix
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        // Put all numbers into a set for quick lookup
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // Find the smallest integer >= sum that is missing
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}