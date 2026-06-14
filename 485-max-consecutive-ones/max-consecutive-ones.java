class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int o = 0;
        int mx = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 1){
                o++;
            }
            else{
            mx = Math.max(mx,o);
            o = 0;
            }
            mx = Math.max(mx,o);
        }
        return mx;
    }
}