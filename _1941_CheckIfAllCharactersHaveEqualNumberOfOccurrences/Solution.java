import java.util.*;

class Solution {

    public boolean isCharHasBeenCounted(char ch, ArrayList<Character> listCharsHaveBeenCounted) {
        for (Character temp : listCharsHaveBeenCounted) {
            if (temp.equals(ch)) {
                return true;
            }
        }
        return false;
    }

    public boolean areOccurrencesEqual(String s) {
        LinkedHashMap<Character, Integer> listCharsWithNumberOfOccurrences = new LinkedHashMap<>();
        ArrayList<Character> listCharsHaveBeenCounted = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {
            int countNumberOfOccurrences = 0;
            if (!(isCharHasBeenCounted(s.charAt(i), listCharsHaveBeenCounted))) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        countNumberOfOccurrences++;
                    }
                }
                listCharsHaveBeenCounted.add(s.charAt(i));
                listCharsWithNumberOfOccurrences.put(s.charAt(i), countNumberOfOccurrences);
            }
            else {
                continue;
            }
        }
        
        try {
            int maxNumberOfOccurences = Collections.max(listCharsWithNumberOfOccurrences.values()); // throw exception
            for (Character key : listCharsWithNumberOfOccurrences.keySet()) {
                if (!(listCharsWithNumberOfOccurrences.get(key) == maxNumberOfOccurences)) {
                    return false;
                }
            }
            return true;
        } catch (NoSuchElementException e) {
            return true;
        }       
    }
}