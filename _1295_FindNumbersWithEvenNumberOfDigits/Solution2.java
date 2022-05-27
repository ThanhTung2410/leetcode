class Solution2 {

    public static boolean isNumberOfDigitsOfNumberDivisibleByTwo(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }

        if (count % 2 == 0)
            return true;
        else 
            return false;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(isNumberOfDigitsOfNumberDivisibleByTwo(num)) {
                count++;
            }
        }
        return count;
    }
}