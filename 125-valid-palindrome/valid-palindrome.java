class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        int l = 0;
        int r = t.length()-1;

        while(l < r){
            while(l < r && !Character.isLetterOrDigit(t.charAt(l))){
                l++;
            }
            while(l < r && !Character.isLetterOrDigit(t.charAt(r))){
                r--;
            }
            if(t.charAt(l) != t.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}