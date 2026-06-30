class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();

        for(char c: s.toCharArray()){
            if(!st.isEmpty() && c == st.peek()){
                st.pop();
            }
            else{
            st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        return ans.reverse().toString();
    }
}