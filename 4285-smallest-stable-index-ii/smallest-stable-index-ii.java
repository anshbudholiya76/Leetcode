class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans = -1;
        int mx = Integer.MIN_VALUE;
        int n  = nums.length;
        int[] sm = new int[n];
        sm[n-1] = nums[n-1];
        for(int i = n-2;i >= 0;i--){
            sm[i] = Math.min(sm[i+1],nums[i]);
        }
        for(int i = 0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            int mn = sm[i];
            if(mx - mn <= k){
                ans = i;
                break;
            }
        }
        return ans;
    }
}