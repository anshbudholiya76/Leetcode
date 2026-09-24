class Solution {
    public int smallestIndex(int[] nums) {
        int ans = 0;
        for(int i = 0;i< nums.length;i++){
            int digsum = 0;
            
            int a = nums[i];
            while(a != 0){
                int d = 0;
                d = a % 10;
                digsum += d;
                a = a/10;
            }
            if(digsum == i){
                ans = i;
                break;
            }
            else{
                ans = -1;
            }
        }
        return ans;
    }
}