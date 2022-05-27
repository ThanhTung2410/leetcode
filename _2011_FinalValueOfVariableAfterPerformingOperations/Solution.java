class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if(operation.equals("X++")) {
                X++;
            }
            else if(operation.equals("X--")) {
                X--;
            }
            else if(operation.equals("++X")) {
                ++X;
            }
            else if(operation.equals("--X")) {
                --X;
            }
        }       
        return X;
    }
}