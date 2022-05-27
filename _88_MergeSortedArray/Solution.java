class Solution {

    public void sortAscendingOrder(int[] arr) {
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

    public void merge(int[] nums1, int[] nums2, int m, int n) {

        // if the array nums2 is empty => The array after merge is still the array nums1 
        if (n == 0) {
            return;
        }

        // if the array nums1 is empty => The array after merge is still the array nums2
        // Because the final sorted array (result of problem) should be stored inside the array nums1
        // => The value (0) in nums1 is only there to ensure the merge result can fit in nums1
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }

        // Assign n element of the array nums2 to the last n elements of the array nums1 which are set to 0
        for (int i = nums1.length - 1; i >= m; i--) {
            n--;
            nums1[i] = nums2[n];
        }

        sortAscendingOrder(nums1);
    }
}