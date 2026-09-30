class Solution {
    public int[] transformArray(int[] nums) {
        int[] p = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 != 0){
                p[i] = 1;
            }
            else{
                p[i] = 0;
            }
        }
        Arrays.sort(p);
        return p;
    }
}