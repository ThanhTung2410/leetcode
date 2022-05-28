import java.util.*;

public class Solution2 {
    public String restoreString(String s, int[] indices) {
        // Because index is unique (character isn't unique) => index is key and character is value
        // TreeMap => keys are sorted in nature
        Map<Integer, Character> listIndicesRespectivelyCharactersAtTheseIndex = new TreeMap<Integer, Character>();
        for (int i = 0; i < s.length(); i++) {
            listIndicesRespectivelyCharactersAtTheseIndex.put(indices[i], s.charAt(i));
        }
        
        String ans = "";
        for (Integer key : listIndicesRespectivelyCharactersAtTheseIndex.keySet()) {
            ans += listIndicesRespectivelyCharactersAtTheseIndex.get(key);
        }
        return ans;
    }
}