class Solution {
    public void comb(int i,int[] c,int t,List<Integer> curr, List<List<Integer>> ans,int sum){
        if(sum == t){
            ans.add(new ArrayList<>(curr)); //copy of curr list
            return;
        }
        if(i == c.length || sum > t){
            return;

        }

        curr.add(c[i]);
        comb(i,c,t,curr,ans,sum+c[i]);

        curr.remove(curr.size()-1);

        comb(i+1,c,t,curr,ans,sum);
    }
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        comb(0,c,t,curr,ans,0);
        return ans;
    }
}