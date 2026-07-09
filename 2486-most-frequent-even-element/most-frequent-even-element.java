class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int freq = 0;
        int ans = -1;

        for(int n : nums){
            if(n % 2 == 0){
            map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        for(int key : map.keySet()){
            int c = map.get(key);
            if(freq < c){
                freq = c;
                ans = key;
            }
            else if(freq == c && key < ans){
                ans = key;
            }
        }
        return ans;
    }
}