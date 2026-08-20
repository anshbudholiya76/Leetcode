class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        list.add(nums[0]);
        list1.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (list.get(list.size() - 1) > list1.get(list1.size() - 1)) {
                list.add(nums[i]);
            } else {
                list1.add(nums[i]);
            }
        }

        int[] res = new int[nums.length];
        int index = 0;

        for (int x : list) {
            res[index++] = x;
        }

        for (int x : list1) {
            res[index++] = x;
        }

        return res;
    }
}