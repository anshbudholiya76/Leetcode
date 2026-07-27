class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n: nums){
            pq.offer(n);
        }
        int n = pq.poll();
        int m = pq.poll();
        return (n-1)*(m-1);
    }
}