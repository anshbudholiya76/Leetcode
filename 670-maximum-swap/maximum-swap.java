class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int mx = 0;
        int[] c = new int[s.length()];
        int[] gr = new int[s.length()];

        for(int i = 0;i<s.length();i++){
            char c1 = s.charAt(i);
            int t = c1 - '0';
            c[i] = t;
        }
        gr[c.length - 1] = -1;
        mx = c.length-1;
        for(int i = c.length-2; i >= 0; i--){
            if(c[i] > c[mx]){
                mx = i;
                
            }
            gr[i] = mx;
        }
        for(int i= 0;i<s.length();i++){
            if(gr[i] != -1 && c[i] < c[gr[i]]){
                int temp = c[i];
                c[i] = c[gr[i]];
                c[gr[i]] = temp;
                break;
            }
        }
        int ans = 0;

        for(int n:c){
            ans *= 10;
            ans += n;
        }
        return ans;
    }
}