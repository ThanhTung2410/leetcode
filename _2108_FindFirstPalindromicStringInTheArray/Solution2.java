class Solution2 {

    public StringBuilder reverseString(String word) {
        char[] chars = word.toCharArray();
        StringBuilder reverseWord = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reverseWord.append(chars[i]);
        }
        return reverseWord;
    }

    public boolean isPalindrome(String word) {
        // To get the desired result, we need to convert StringBuilder to String
        if (reverseString(word).toString().equals(word)) {
            return true;
        }
        return false;
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if(isPalindrome(word)) {
                return word;
            }
        }     
        return "";   
    }
}