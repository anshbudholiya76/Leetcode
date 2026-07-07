class Solution {
    public int lengthOfLastWord(String s) {
        String t = s.trim();
        int i = t.length()-1;
        int l = 0;
        while(i >= 0 && t.charAt(i) != ' '){
            l++;
            i--;
        }
        return l;
    }
}