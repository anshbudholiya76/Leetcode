class Solution {
    public boolean checkDivisibility(int n) {
        int s = 0;
        int p = 1;
        int o = n;
        while(o != 0){
            int d = o % 10;
            s += d;
            p *= d;
            o = o/10;
        }
        int sum = s + p;
        if(n % sum == 0){
            return true;
        }
        else{
            return false;
        }
    }
}