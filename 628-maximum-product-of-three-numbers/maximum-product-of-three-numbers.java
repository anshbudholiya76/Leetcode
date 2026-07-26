class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int s1 = nums[0];
        int s2 = nums[1];
        int l1 = nums[nums.length-1];
        int pro = 1;
        for(int i = 0;i< 3;i++){
            pro *= nums[nums.length-1-i];
        }
        return Math.max(pro,s1*s2*l1);
    }
}