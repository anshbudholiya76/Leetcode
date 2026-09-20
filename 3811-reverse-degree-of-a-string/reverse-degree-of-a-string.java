class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            // 1-based index of the string position
            int stringPos = i + 1;
            
            // Reversed alphabet position ('a' = 26, 'b' = 25, ..., 'z' = 1)
            int reverseAlphabetPos = 26 - (s.charAt(i) - 'a');
            
            // Add the product to the cumulative sum
            sum += stringPos * reverseAlphabetPos;
        }
        return sum;
    }
}
