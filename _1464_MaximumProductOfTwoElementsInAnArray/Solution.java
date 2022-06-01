class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = 0;
        int indexOfFirstMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                firstMax = nums[i];
                indexOfFirstMax = i;
            }
        }       

        int secondMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == indexOfFirstMax) {
                continue;
            }
            if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return (firstMax - 1) * (secondMax  - 1);
    }
}