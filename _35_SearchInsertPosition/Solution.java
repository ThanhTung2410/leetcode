class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        
        int max = nums[0];
        int pos = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i]) {
                max = nums[i];
                pos = i;
            }
            
            if (target < nums[i]) { 
                return i;
            }
            
        }
        
        if (target >= max) {
            return pos + 1;
        }
        
        return pos;
    }
}