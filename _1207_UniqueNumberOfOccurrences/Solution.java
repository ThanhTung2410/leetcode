import java.util.*;

class Solution {

    public boolean isNumHasBeenCounted(int num, ArrayList<Integer> listNumsHaveBeenCounted) {
        for (Integer numHasBeenCounted : listNumsHaveBeenCounted) {
            if (num == numHasBeenCounted) {
                return true;
            }
        }
        return false;
    }

    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> listNumsHaveBeenCounted = new ArrayList<>();
        ArrayList<Integer> listNumberOfOccurrences = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {    
            int count = 0;
            if (!isNumHasBeenCounted(arr[i], listNumsHaveBeenCounted)) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                listNumsHaveBeenCounted.add(arr[i]);
                listNumberOfOccurrences.add(count);
            }
        }

        for (int i = 0; i < listNumberOfOccurrences.size() - 1; i++) {
            for (int j = i + 1; j < listNumberOfOccurrences.size(); j++) {
                if (listNumberOfOccurrences.get(i) == listNumberOfOccurrences.get(j)) {
                    return false;
                }
            }
        }    
        return true;   
    }
}