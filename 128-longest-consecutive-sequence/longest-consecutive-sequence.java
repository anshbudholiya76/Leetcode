class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int mxlength = 0;

        for(int num: nums){
            set.add(num);
        }
    
        for(int key: set){
            if(!set.contains(key + 1)){
                int i = 1;
                int len = 1;
                while(set.contains(key-i)){
                    len++;
                    i++;
                }
                mxlength = Math.max(len,mxlength);
            }
        }
        return mxlength;
    }
}