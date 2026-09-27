class Solution {
    public int smallestEvenMultiple(int n) {
        int a = 0;
        for(int i = n;i<=2*n;i++){
            if(i % n == 0 && i % 2 == 0){
                a = i;
                break;
            }
        }
        return a;
    }
}