class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int m : nums){
            map.put(m,map.getOrDefault(m,0)+1);
        }
        for(int i = 1; i <= n; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}