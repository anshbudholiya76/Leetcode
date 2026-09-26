class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int m1 = 0;
        int m2 = 0;
        for(char n:map.keySet()){
            if(n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u'){
                m1 = Math.max(map.get(n),m1);
            }
            else{
                m2 = Math.max(map.get(n),m2);
            }
        }
        return m1+m2;
    }
}