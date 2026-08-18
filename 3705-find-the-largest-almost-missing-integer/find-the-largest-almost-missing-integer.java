class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int mx = 0;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            mx = Math.max(mx, n);
        }

        if (k == nums.length) {
            return mx;
        }

        else if (k == 1) {
            int ans = -1;

            for (int n : nums) {
                if (map.get(n) == 1) {
                    ans = Math.max(ans, n);
                }
            }

            return ans;
        }

        else {
            if (map.get(nums[0]) == 1 && 
                map.get(nums[nums.length - 1]) == 1) {

                return Math.max(nums[0], nums[nums.length - 1]);
            }

            else if (map.get(nums[0]) > 1 && 
                     map.get(nums[nums.length - 1]) > 1) {

                return -1;
            }

            else if (map.get(nums[0]) == 1 && 
                     map.get(nums[nums.length - 1]) > 1) {

                return nums[0];
            }

            else if (map.get(nums[0]) > 1 && 
                     map.get(nums[nums.length - 1]) == 1) {

                return nums[nums.length - 1];
            }
        }

        return -1;
    }
}