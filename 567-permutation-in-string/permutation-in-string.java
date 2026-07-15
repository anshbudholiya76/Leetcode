class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c : s1.toCharArray()){
            freq1[c - 'a']++;

        }
        int i = 0;
        for(int j = 0;j<s2.length();j++){
            char c = s2.charAt(j);
            freq2[c - 'a']++;
            if(j-i+1 > s1.length()){
                freq2[s2.charAt(i) - 'a']--;
                i++;
            }
            if(j-i+1 == s1.length() && Arrays.equals(freq1,freq2)){
                return true;
            }
            
        }
        return false;
    }
}