class Solution {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) { // m, n is respectively size of array nums1, nums2
        // Add each element from array nums2 to array nums1
        for (int num : nums2) {
            addElementToArray(num, nums1, m); // need to pass m to method because the actual size of nums1 is m + n
            m += 1; // after adding => size of array nums1 which is m will increase by 1 
        }
    }

    private void addElementToArray(int num, int[] nums1, int m) {
        boolean isExistElementInNums1GreaterThanNum = false; // Find whether there is an element in array nums1 which is greater than num or not

        // Loop through each element of array nums1 to find the first element greater than num
        for (int i = 0; i < m; i++) {
            if (nums1[i] > num) {
                isExistElementInNums1GreaterThanNum = true; // There is an element in array nums1 which is greater than num
                
                // Move all elements greater than num to the right by 1 unit
                for (int j = m; j > i; j--) {
                    nums1[j] = nums1[j-1];
                }

                // Add num to the position of the first element greater than it
                nums1[i] = num;

                break; // done the task => don't need to loop through the remain elements
            }
        }

        // There isn't an element in array nums1 which is greater than num => num is the max element
        // => Add num to the end of array nums1
        if(!isExistElementInNums1GreaterThanNum) {
            nums1[m] = num;
        }
    }
}