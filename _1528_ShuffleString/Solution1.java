import java.util.*;

class Solution1 {
    public String restoreString(String s, int[] indices) {
        // Because index is unique (character isn't unique) => index is key and character is value
        LinkedHashMap<Integer, Character> listIndicesRespectivelyCharactersAtTheseIndex = new LinkedHashMap<Integer, Character>();
        for (int i = 0; i < s.length(); i++) {
            listIndicesRespectivelyCharactersAtTheseIndex.put(indices[i], s.charAt(i));
        }

        // Convert LinkedHashMap into TreeMap and after that keys are sorted in nature
        Map<Integer, Character> map = new TreeMap<>(listIndicesRespectivelyCharactersAtTheseIndex);
        
        String ans = "";
        for (Integer key : map.keySet()) {
            ans += map.get(key);
        }
        return ans;
    }
}