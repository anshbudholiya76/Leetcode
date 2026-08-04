class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c1 = 0;
        for(int c : costs){
            if(c <= coins){
                coins -= c;
                c1++;
            }
        }
        return c1;
    }
}