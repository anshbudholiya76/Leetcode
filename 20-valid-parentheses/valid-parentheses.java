class Solution {
    public boolean isValid(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for (char c : s.toCharArray()) {

            // Push the expected closing bracket
            if (c == '(') {
                st.push(')');
            } else if (c == '{') {
                st.push('}');
            } else if (c == '[') {
                st.push(']');
            } else {
                // If stack is empty or top doesn't match current closing bracket
                if (st.isEmpty() || st.pop() != c) {
                    return false;
                }
            }
        }

        // Stack should be empty if all brackets are matched
        return st.isEmpty();
    }
}