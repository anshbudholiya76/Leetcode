class Solution {
    public int findMiddleIndex(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        int sum =0;
        for(int num : nums){
            sum += num;

        }
        for(int i=0;i<nums.length;i++){
            rsum = sum - lsum - nums[i];
            if(lsum == rsum ){
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}