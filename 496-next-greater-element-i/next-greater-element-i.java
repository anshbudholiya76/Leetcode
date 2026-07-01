class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        HashMap<Integer,Integer> map = new HashMap<>();
        
        ArrayDeque<Integer> st = new ArrayDeque<>();

        int n = nums2.length;
        map.put(nums2[n-1], -1);
        st.push(nums2[n-1]);

        for(int i = n-2;i>= 0;i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int i = 0;
        for(int n1:nums1){
            
            ans[i++] = map.get(n1);
        }
        return ans;
    }
    
}