class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int k : map.keySet()){
            if(map.get(k) > (nums.length/2)){
                ans = k;
            }
        }
        return ans;
    }
}