class Solution {
    public int maxDepth(String s) {
      Deque<Character> st = new ArrayDeque<>();
      int l = 0;
      for(char c : s.toCharArray()){
        if(c == '('){
            st.push(c);
        }
        if(c == ')'){
            st.pop();
        }
        l = Math.max(l,st.size());
      }
      return l;
    }
}