class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] allowedChar = new boolean[26];

        // Mark allowed characters
        for (char ch : allowed.toCharArray()) {
            allowedChar[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean valid = true;

            for (char ch : word.toCharArray()) {
                if (!allowedChar[ch - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}