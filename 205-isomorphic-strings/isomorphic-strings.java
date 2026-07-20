class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>(); 

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            
            
            if(map1.containsKey(c) && map1.get(c) != d){
                return false;
            }
            else if(map2.containsKey(d) && map2.get(d) != c){
                return false;
            }
            else{
                map1.put(c,d);
                map2.put(d,c);
            }
        }
        return true;
    }
}