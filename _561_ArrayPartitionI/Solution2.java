class Solution2 {

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
        int[][] pairs = new int[nums.length / 2][2];

        quicksort(nums, 0, nums.length - 1);

        int sum = 0;
        int i = 0;
        for (int[] pair : pairs) {
            if (i >= nums.length - 1) {
                break;
            }

            pair[0] = nums[i];
            pair[1] = nums[i + 1];
            i += 2;

            if (pair[0] <= pair[1]) {
                sum += pair[0];
            } else {
                sum += pair[1];
            }
        }
        return sum;
    }
}