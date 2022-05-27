import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int mostWordsFound(String[] sentences) {
        ArrayList<Integer> listNumberOfWordsOfEachSentence = new ArrayList<Integer>();
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            listNumberOfWordsOfEachSentence.add(words.length);
        }       
        return Collections.max(listNumberOfWordsOfEachSentence);
    }
}