class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] matrixAfterTranspose = new int[n][m]; // matrix with size m x n after transpose
                                                      // will be matrix with size n x m

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixAfterTranspose[j][i] = matrix[i][j];
            }
        }

        return matrixAfterTranspose;
    }
}