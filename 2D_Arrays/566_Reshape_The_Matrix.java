/*
566. Reshape the Matrix

In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1: Input: mat = [[1,2],[3,4]], r = 1, c = 4 Output: [[1,2,3,4]]

Difficulty : Easy
*/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        // int m = mat.length;
        // int n = mat[0].length;

        // if (m * n != r * c) {
        //     return mat;
        // }

        // int[][] result = new int[r][c];
        // int idx = 0;
        
        // for(int i = 0; i< mat.length ; i++){
        //     for(int j = 0; j< mat[0].length; j++){

        //         int newRow = idx / c;
        //         int newCol = idx % c;

        //         result[newRow][newCol] = mat[i][j];
        //         idx++;
        //     }
        // }
              
        // return result;

        int m = mat.length;
        int n = mat[0].length;

        // Check whether reshaping is possible
        if (m * n != r * c) {
            return mat;
        }

        // Step 1: Flatten original matrix
        int[] temp = new int[m * n];

        int idx = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[idx] = mat[i][j];
                idx++;
            }
        }

        // Step 2: Create new matrix
        int[][] result = new int[r][c];

        // Step 3: Fill the new matrix
        idx = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = temp[idx];
                idx++;
            }
        }

        return result;

    }
}