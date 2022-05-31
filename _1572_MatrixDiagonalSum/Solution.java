class Solution {
    public int diagonalSum(int[][] mat) {
        int sumOfAllElementsOnPrimaryDiagonal = 0;
        int sumOfAllElementsOnSecondaryDiagonal = 0;

        for (int i = 0; i < mat.length; i++) {  // mat.length returns the number of rows of matrix
            for (int j = 0; j < mat[i].length; j++) { // // mat[i].length returns the number of columns of matrix
                if (i == j) {
                    sumOfAllElementsOnPrimaryDiagonal += mat[i][j];
                }
                if (i + j == mat.length - 1) {
                    sumOfAllElementsOnSecondaryDiagonal += mat[i][mat.length - 1 - i];
                }
            }
        }

        if (mat.length % 2 == 0) {
            return sumOfAllElementsOnPrimaryDiagonal + sumOfAllElementsOnSecondaryDiagonal;
        }
        return sumOfAllElementsOnPrimaryDiagonal + sumOfAllElementsOnSecondaryDiagonal - mat[mat.length / 2][mat.length / 2]; // There will be overlap element in the primary and secondary diagonals if and only if the length of the matrix is odd. This overlap element is at the center of matrix
    }
}