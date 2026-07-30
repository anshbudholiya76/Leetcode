class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int n = nums1.length;
        int m = nums2.length;
        int[] mer = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i != n && j != m && k != n+m){
            if(nums1[i] > nums2[j]){
                mer[k] = nums2[j];
                j++;
            }
            else{
                mer[k] = nums1[i];
                i++;
            }
            k++;
        }
        while(i != n){
            mer[k] = nums1[i];
            i++;
            k++;
        }
        while(j != m){
            mer[k] = nums2[j];
            j++;k++;
        }
        
        if(mer.length % 2 == 0){
            median = (double)(mer[(n+m)/2] + mer[(n+m)/2 - 1])/2;
        } 
        else{
            median = mer[(n+m) / 2];
        }
        return median;
    }
}