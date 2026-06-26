class Solution {
    public int reqP(int[] nums,int sum){
        int currsum = 0;
        int parts = 1;

        for(int n:nums){
            if(currsum + n > sum ){
                parts++;
                currsum = n;
            }
            else{
                currsum += n;
            }
        }
        return parts;
    }
    public int splitArray(int[] nums, int k) {
        int l = 0;
        int h = 0;

        for(int n : nums){
            l = Math.max(l,n);
            h += n;
        }
        while( l < h){

            int mid = l + (h-l)/2;

            if(reqP(nums,mid) <= k){
                h = mid; 
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
}