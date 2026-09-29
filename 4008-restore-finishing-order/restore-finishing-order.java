class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
        for(int n:friends){
            set.add(n);
        }
        int j = 0;
        for(int i:order){
            if(set.contains(i)){
                ans[j++] = i;
            }
        }
        return ans;
    }
}