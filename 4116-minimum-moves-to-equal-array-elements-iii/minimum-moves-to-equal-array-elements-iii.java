class Solution {
    public int minMoves(int[] nums) {
        int m = 0;
        for(int n:nums){
            m = Math.max(n,m);
        }
        int c = 0;
        for(int n:nums){
            c += m-n;
        }
        return c;
    }
}