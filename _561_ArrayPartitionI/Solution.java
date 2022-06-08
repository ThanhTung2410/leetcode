class Solution {

    // Quicksort
    static void swap(int[] arr, int low, int pivot) {
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }

    static int partition(int[] arr, int low, int high) {
        int p = low, j;
        for (j = low + 1; j <= high; j++)
            if (arr[j] < arr[low])
                swap(arr, ++p, j);

        swap(arr, low, p);
        return p;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }

    public int arrayPairSum(int[] nums) {
        quicksort(nums, 0, nums.length - 1);

        int sum = 0;
        // After sorting array, the minimum element in each pair is at even index
        // arr[] = {1, 2, 3, 4, ...}
        // pairs   (1, 2),(3, 4),...
        // index    0, 1,  2, 3,...
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}