class Solution1 {

    public static int countDigitsOfNumber(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(countDigitsOfNumber(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}