class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverseNum = 0;
        while(temp > 0) {
            reverseNum *= 10; 
            reverseNum += (temp % 10); 
            temp /= 10; 
        }
        if (reverseNum == x) {
            return true;
        }
        else {
            return false;
        }
    }
}