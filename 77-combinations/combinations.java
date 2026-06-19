class Solution {
    public void comb(int i, int[] arr,int k,List<List<Integer>> ans,List<Integer> curr){
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i == arr.length){
            return;
        }
        curr.add(arr[i]);
        comb(i+1,arr,k,ans,curr);

        curr.remove(curr.size()-1);
        comb(i+1,arr,k,ans,curr);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = i+1;
        }
        comb(0,arr,k,ans,curr);
        return ans;
    }
}