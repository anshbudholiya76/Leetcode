class Solution {
    public int First(int[] nums, int target){
        int l = 0;
        int h = nums.length-1;
        int ans = -1;
         
        while(l <= h){
            int mid = l + (h - l)/2;

            if(nums[mid] == target){
                ans = mid;
                h = mid -1;

            }
            else if(nums[mid] < target){
                l = mid +1 ;

            }
            else{
                h = mid -1;
            }

        }
        return ans;
    }
    public int Last(int[] nums, int target){
        int l = 0;
        int h = nums.length-1;
        int ans = -1;
         
        while(l <= h){
            int mid = l + (h - l)/2;

            if(nums[mid] == target){
                ans = mid;
                l = mid + 1;
            }
            else if(nums[mid] < target){
                l = mid +1 ;

            }
            else{
                h = mid -1;
            }

        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{First(nums,target) , Last(nums,target)};
    }
}