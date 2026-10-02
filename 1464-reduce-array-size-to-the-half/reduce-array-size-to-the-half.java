class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int m = arr.length;
        int p = m;
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int c = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : map.values()){
            pq.offer(n);
        }
        while(p > m/2){
            p -= pq.poll();
            c++;
        }
        return c;
    }
}