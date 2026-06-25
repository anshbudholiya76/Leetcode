class Solution {
    public int ReqH(int[] piles,int speed){
        int total = 0;
        for(int p : piles){
            total += (p + speed - 1) / speed;

        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int p : piles){
            high = Math.max(high,p);
        }

        while(low < high){
            int mid = low + (high-low)/2;

            if(ReqH(piles,mid) <= h){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}