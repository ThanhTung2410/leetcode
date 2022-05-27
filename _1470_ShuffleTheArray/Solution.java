class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Get first n elements in array nums
        int[] nFirstElements = new int[n]; // [x1, x2, x3,...]
        for (int i = 0; i < n; i++) {
            nFirstElements[i] = nums[i];
        }

        // Get next n elements in array nums
        int[] nNextElements = new int[n]; // [y1, y2, y3,...]
        int j = 0;
        for (int i = n; i < nums.length; i++) {
            nNextElements[j] = nums[i];
            j++;
        }

        int[] ans = new int[2*n]; // [x1, y1,...]
        int k = 0;
        int l = 0;
        for (int i = 0; i < ans.length; i+= 2) {
            ans[i] = nFirstElements[k]; // ans[0] = x1, ans[2] = x2,...
            k++;
            ans[i+1] = nNextElements[l]; // ans[1] = y1, ans[3] = y2,...
            l++;
        }
        return ans;
    }
}