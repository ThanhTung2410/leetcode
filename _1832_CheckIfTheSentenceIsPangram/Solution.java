class Solution {
    public boolean checkIfPangram(String sentence) {   
        // English alphabet     
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        // Check every letter of the English alphabet (26 letters) appears at least once in String sentence
        boolean[] isSentenceHasAllLetterInAlphabet = new boolean[alphabet.length]; // default value: false

        // Loop through letter in alphabet from a to z
        for (int i = 0; i < alphabet.length; i++) {
            // Loop through each letter of sentence
            for (int j = 0; j < sentence.length(); j++) {
                if(alphabet[i] == sentence.charAt(j)) {
                    isSentenceHasAllLetterInAlphabet[i] = true; 
                    break;
                }
            }
        }
        
        for (boolean isLetterOfSentenceExistInAlphabet : isSentenceHasAllLetterInAlphabet) {
            if (isLetterOfSentenceExistInAlphabet != true) { // the sentence doesn't have all letter in alphabet
                return false;
            }
        }
        return true;
    }
}