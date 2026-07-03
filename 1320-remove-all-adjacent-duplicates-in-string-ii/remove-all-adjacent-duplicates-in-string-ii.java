class Solution {
    class pair{
        char c;
        int freq;
        pair(char c,int freq){
            this.c = c;
            this.freq = freq;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<pair> st = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();

        for(int  i = 0; i<s.length();i++){
            char curr = s.charAt(i);

            if(st.isEmpty() || st.peek().c != curr){
                st.push(new pair(curr,1));
            }else{
                st.peek().freq++;
                if(st.peek().freq == k){
                    st.pop();
                    }
                }
        }
        while(!st.isEmpty()){
            for(int i =0;i<st.peek().freq;i++){
                ans.append(st.peek().c);
            }
            st.pop();
        }
        return ans.reverse().toString();
    }
}
