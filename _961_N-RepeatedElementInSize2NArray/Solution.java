class Solution {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int countNumberOfOccurrences = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    countNumberOfOccurrences++;
                    if (countNumberOfOccurrences == nums.length / 2) { // nums[i] is repeated n times
                        return nums[i];
                    }
                }
            }
        }
        return -1;
    }
}