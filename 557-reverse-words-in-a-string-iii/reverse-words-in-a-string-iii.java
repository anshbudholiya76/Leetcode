class Solution {
    private void reverse(char[] arr,int st,int en){
        while(st < en){
            char temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;
        }
    }
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        for(int j = 0; j <= arr.length;j++){
            if(j == arr.length || arr[j] == ' ' ){
                reverse(arr,i,j-1);
                i = j+1;
            }
        }
        return new String(arr);
    }
}