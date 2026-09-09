class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int t = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                t = Math.min(t,Math.abs(start - i));
            }
        }
        return t;
    }
}