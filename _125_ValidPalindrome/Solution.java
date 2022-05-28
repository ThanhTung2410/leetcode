class Solution {

    public StringBuilder removePunctuationsAndLowerCaseLetters(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // Remove punctuations
        for (int i = 0; i < chars.length; i++) {
            if (!((chars[i] >= 33 && chars[i] <= 47) || (chars[i] >= 58 && chars[i] <= 64) || (chars[i] >= 91 && chars[i] <= 96) || (chars[i] >= 123 && chars[i] <= 126) || chars[i] == ' ')) {
                sb.append(Character.toLowerCase(chars[i])); // lower case letter
            }
        }
        return sb;
    }

    public StringBuilder reverseString(String s) {
        StringBuilder sb = removePunctuationsAndLowerCaseLetters(s);
        return sb.reverse();
    }

    public boolean isPalindrome(String s) {
        if(reverseString(s).toString().equals(removePunctuationsAndLowerCaseLetters(s).toString())) {
            return true;
        }
        return false;
    }
}