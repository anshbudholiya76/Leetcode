class Solution {
    public String reverseOnlyLetters(String s) {
     int i = 0;
     int j = s.length()-1;
     char[] str = s.toCharArray();

     while(i < j){
        while(i < j && !Character.isLetter(s.charAt(i))){
            i++;
        }
        while(i < j && !Character.isLetter(s.charAt(j))){
            j--;
        }
        char temp =str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
     } 
     return new String(str);
    }
}