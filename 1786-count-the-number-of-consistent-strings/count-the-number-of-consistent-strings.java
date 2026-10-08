class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        
        HashSet<Character> set = new HashSet<>();
        for(char c1 : allowed.toCharArray()){
            set.add(c1);
        }
        for(int i = 0;i<words.length;i++){
            boolean b = true;
            String l = words[i];
            for(int j = 0;j<l.length();j++){
                char s = l.charAt(j);
                if(!set.contains(s)){
                    b = false;
                }
            }
            if(b == true){
                c++;
            }
        }
        return c;
    }
}