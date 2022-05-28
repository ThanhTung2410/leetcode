import java.util.*;

class Solution1 {

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

    public int missingNumber(int[] nums) {
        // Convert an Array to ArrayList
        ArrayList<Integer> listNums = new ArrayList<Integer>();
        for (int num : nums) {
            listNums.add(num);
        }

        // Create an array contains distinct numbers in range [0,n], n is length of
        // array nums
        int[] arrayContainsDistinctNumbersInRange0ToN = new int[nums.length + 1]; // [0,...,n]
        for (int i = 0; i < arrayContainsDistinctNumbersInRange0ToN.length; i++) {
            arrayContainsDistinctNumbersInRange0ToN[i] = i;
        }

        sortAsc(nums);

        // Find the missing number in the list contains full number
        for (int i = 0; i < arrayContainsDistinctNumbersInRange0ToN.length; i++) {
            if (!listNums.contains(arrayContainsDistinctNumbersInRange0ToN[i])) { // listNums.contains(arrayContainsDistinctNumbersInRange0ToN[i])
                                                                                  // == false
                return arrayContainsDistinctNumbersInRange0ToN[i];
            }
        }

        return -1; // there isn't missing number
    }
}