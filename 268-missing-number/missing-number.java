class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exps = (n*(n+1))/2;
        int sum = 0 ;
        for(int a: nums){
            sum += a;
        }
        return exps-sum;
    }
}