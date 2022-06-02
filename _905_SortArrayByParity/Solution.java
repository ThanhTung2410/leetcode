class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> evenNums = new ArrayList<>();
        ArrayList<Integer> oddNums = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNums.add(num);
            }
            else {
                oddNums.add(num);
            }
        }
        
        evenNums.addAll(oddNums);
        
        int[] result = new int[evenNums.size()];
        for (int i = 0; i < evenNums.size(); i++) {
            result[i] = evenNums.get(i);
        }
        
        return result;
    }
}