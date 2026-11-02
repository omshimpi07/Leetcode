/*
1582. Special Positions in a Binary Matrix

Given an m x n binary matrix mat, return the number of special positions in mat.
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

Example 1 Input: mat = [[1,0,0],[0,0,1],[1,0,0]] Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

Dificulty : easy

Approach : Count the number of 1s in each row and column, then iterate through the matrix to find special positions.

*/

class Solution {
    public int numSpecial(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        // Step 1: Count ones in every row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        // Step 2: Find special positions
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 1 &&
                    rowCount[i] == 1 &&
                    colCount[j] == 1) {

                    count++;
                }
            }
        }

        return count;



    }
}