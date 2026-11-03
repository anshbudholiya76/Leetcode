class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        int med = nums[nums.length/2];
        for(int n : nums){
            c += Math.abs(med-n);
        }
        return c;
    }
}