class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int mx = 0;
        for(int i = 0; i < n ;i++){
            mx = Math.max(mx,nums[i]);
            prefix[i] = gcd(mx,nums[i]);
        }
        Arrays.sort(prefix);
        int l = 0;
        int r = nums.length-1;
        long sum = 0;

        while(l < r){
            sum += gcd(prefix[l],prefix[r]);
            l++;
            r--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}