class Solution {
    public int findGCD(int[] nums) {
       int a = Integer.MAX_VALUE;
       int b = 0;
       for(int n : nums){
        a = Math.min(n,a);
        b = Math.max(n,b);
       } 
       while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;

       }
       return a;
    }
}