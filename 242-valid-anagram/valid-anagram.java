class Solution {
    public boolean isAnagram(String s, String t) {
       int[] freq1 = new int[26]; 
       int[] freq2 = new int[26];

       if(s.length() != t.length()){
        return false;
       }
       for(int i = 0;i<s.length();i++){
        char c = s.charAt(i);
        char c2 = t.charAt(i);
        freq1[c - 'a']++;
        freq2[c2 - 'a']++;
       }
       return Arrays.equals(freq1,freq2);
    }
}