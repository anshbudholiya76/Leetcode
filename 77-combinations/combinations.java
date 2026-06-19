class Solution {
    public void comb(int start, int n, int k,
                     List<Integer> curr,
                     List<List<Integer>> ans) {

        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int num = start; num <= n; num++) {
            curr.add(num);
            comb(num + 1, n, k, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(1, n, k, new ArrayList<>(), ans);
        return ans;
    }
}