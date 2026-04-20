/*
1572. Matrix Diagonal Sum
Given a square matrix mat, return the sum of the matrix diagonals.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]  
Output: 25

Example 2: 
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]] 
Output: 8

Difficulty : easy

Approach:
1. Initialize a variable sum to store the sum of the diagonals.
2. Iterate through the matrix using a loop from 0 to n-1 (where n is the size of the matrix).

Time Complexity: O(n) where n is the size of the matrix.
Space Complexity: O(1) since we are using only a constant amount of extra space for

*/

class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        for(int i = 0; i<mat.length;i++){

            sum += mat[i][i];
                
            if(i != mat.length - 1 - i){
                sum += mat[i][mat.length-i-1];
            }
            
        }
        
        return sum;
    }
}