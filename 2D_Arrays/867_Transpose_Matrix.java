/*
867. Transpose Matrix
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Difficulty : easy

Approach : 
1.Changes Columns to rows and rows to columns
2. Create a new 2D array with dimensions swapped (n x m) where m and n are the number of rows and columns in the original matrix, respectively.
3. Iterate through each element in the original matrix and assign it to the corresponding position in the
 

*/

class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] result = new int[n][m];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}