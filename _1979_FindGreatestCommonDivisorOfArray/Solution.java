class Solution {
    
    public void sortAsc(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    private int GCD(int a, int b) {
        while(a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        return a;
    }
    
    public int findGCD(int[] nums) {
        sortAsc(nums);
        return GCD(nums[0], nums[nums.length - 1]);
    }
}