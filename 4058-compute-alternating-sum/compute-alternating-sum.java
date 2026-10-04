class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;
        int e = 0;
        int o = 0;
        for(int i = 0;i<n;i=i+2){
            e += nums[i];
        }
        for(int i = 1;i<n;i=i+2){
            o += nums[i];
        }
        return e - o;
    }
}