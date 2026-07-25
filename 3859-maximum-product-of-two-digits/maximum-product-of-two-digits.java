import java.util.Arrays;

class Solution {
    public int maxProduct(int n) {
        int temp = n;
        int c = 0;

        // Count digits
        while (temp != 0) {
            c++;
            temp /= 10;
        }

        int[] arr = new int[c];
        temp = n;

        // Store digits
        for (int i = 0; i < c; i++) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        Arrays.sort(arr);

        return arr[c - 1] * arr[c - 2];
    }
}