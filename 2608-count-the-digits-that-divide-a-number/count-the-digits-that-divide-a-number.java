class Solution {
    public int countDigits(int num) {
        int c = 0;
        int o = num;
        while(o != 0){
            int dig = o % 10;
            if(num % dig==0){
                c++;
            }
            o = o/10;
        }
        return c;
    }
}