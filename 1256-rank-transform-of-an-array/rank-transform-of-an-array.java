class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=1;
        int[] res = new int[arr.length];

        for(int a:temp){
            if(!map.containsKey(a)){
                map.put(a,i++);
            }  
        }
        for(int j =0;j<arr.length;j++){
            res[j] = map.get(arr[j]);
        }
        return res;
        
    }
}