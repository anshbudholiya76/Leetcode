class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        PriorityQueue<int[] > pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for(int i = 0;i < n;i++ ){
            pq.offer(new int[]{score[i],i});
        }
        int rank = 1;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int sco = curr[0];
            int oriind = curr[1];
            if(rank == 1){
                ans[oriind] = "Gold Medal";
            }
            else if(rank == 2){
                ans[oriind] = "Silver Medal";
            }
            else if(rank == 3){
                ans[oriind] = "Bronze Medal";
            }
            else{
                ans[oriind] = String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}