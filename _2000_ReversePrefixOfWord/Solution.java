class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();

        boolean isCharExistInWord = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                isCharExistInWord = true;
                
                StringBuilder prefix = new StringBuilder(word.substring(0, i + 1)); // [0, i]
                prefix.reverse();

                StringBuilder remain = new StringBuilder(word.substring(i + 1));
                
                result.append(prefix);
                result.append(remain);
                break;
            }          
        }
        
        if (!isCharExistInWord) {
            return word;
        }

        return result.toString();
    }
}