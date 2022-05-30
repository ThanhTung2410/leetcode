import java.util.*;

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        // Because index is unique => index is key, word is value
        // TreeMap => keys are sorted in nature
        Map<Integer, String> listIndicesWithWordAtTheseIndexInAscOrder = new TreeMap<Integer, String>();

        for (String word : words) {
            listIndicesWithWordAtTheseIndexInAscOrder.put(Character.getNumericValue(word.charAt(word.length() - 1)), // get the number behind word which is the serial number for arrange
                    word.substring(0, word.length() - 1)); // remove the number at the end of word
        }

        StringBuilder ans = new StringBuilder();
        for (Integer key : listIndicesWithWordAtTheseIndexInAscOrder.keySet()) {
            ans.append(listIndicesWithWordAtTheseIndexInAscOrder.get(key) + " ");
        }
        ans.deleteCharAt(ans.length() - 1); // remove space at the end of string
        return ans.toString(); // Convert StringBuilder to String
    }
}