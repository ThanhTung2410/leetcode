import java.util.*;

class Solution {

    public void sortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> listOfTargetIndicesOfNums = new ArrayList<Integer>();  
        
        sortAsc(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                listOfTargetIndicesOfNums.add(i);
            }
        }

        return listOfTargetIndicesOfNums;
    }
}