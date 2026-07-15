class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd = n*n;
        int sumeven = n*(n+1);
        int n1 = sumodd;
        int n2 = sumeven;
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
}