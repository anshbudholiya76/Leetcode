class Solution {
    public int maximumLengthSubstring(String s) {
        int i = 0;
        int j = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int mx = 0;
        while(j < s.length()){
            char c = s.charAt(j);
            
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c) > 2 ){
                char c1 = s.charAt(i);
                map.put(c1,map.get(c1) - 1);
                i++;
                l--;
            }
            l++;
            mx = Math.max(mx,l);
            j++;
        }
        return mx;
    }
}