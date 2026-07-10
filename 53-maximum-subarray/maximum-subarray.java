class Solution {
    public int maxSubArray(int[] nums) {
        int Bestend = nums[0];
        int ans = nums[0];
        for(int i = 1 ;i<nums.length; i++){
            int v1 = Bestend + nums[i];
            int v2 = nums[i];

            Bestend = Math.max(v1,v2);

            ans = Math.max(Bestend,ans);
        }
        return ans;
    }
    
}