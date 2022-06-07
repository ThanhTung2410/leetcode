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
    
    public boolean divideArray(int[] nums) {
		
		if (nums.length % 2 != 0) {
			return false;
		}
		
        HashMap<Integer, Integer> listNumsWithTheirNumberOfOccurrences = new HashMap<>();
        ArrayList<Integer> listNumsHaveBeenCounted = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 1; i++) {
            int count = 1;
            if (!isNumHasBeenCounted(nums[i], listNumsHaveBeenCounted)) {
               for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                } 
                listNumsHaveBeenCounted.add(nums[i]);
                listNumsWithTheirNumberOfOccurrences.put(nums[i], count);
            }
        }
        
        for (Integer key : listNumsWithTheirNumberOfOccurrences.keySet()) {
            if (listNumsWithTheirNumberOfOccurrences.get(key) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}