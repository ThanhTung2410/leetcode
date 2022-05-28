class Solution1 {

    public String reverseString(String word) {
        char[] chars = word.toCharArray();
        String reverseWord = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverseWord += chars[i];
        }
        return reverseWord;
    }

    public boolean isPalindrome(String word) {
        if (reverseString(word).equals(word)) {
            return true;
        }
        return false;
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
}