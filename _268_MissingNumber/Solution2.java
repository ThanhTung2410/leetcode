class Solution2 {

    public int missingNumber(int[] nums) {
        int sumOfArrayWhichHasMissingNumber = 0;
        for (int num : nums) {
            sumOfArrayWhichHasMissingNumber += num;
        }

        // Calculate sum of distinct numbers in range [0,n], n is length of array nums
        int sumOfArrayWhichHasFullNumber = 0;
        // An array which contains all distinct numbers in range [0,n] is array has full numbers
        for (int i = 0; i < (nums.length + 1); i++) {
            sumOfArrayWhichHasFullNumber += i;
        }
        
        return sumOfArrayWhichHasFullNumber - sumOfArrayWhichHasMissingNumber; // the missing number
    }
}