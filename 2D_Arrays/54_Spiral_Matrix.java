/*
54. Spiral Matrix
Given an m x n matrix, return all elements of the matrix in spiral order.
Example 1:
Input: matrix = [[1,2,3],
                [4,5,6],
                [7,8,9]]    
Output: [1,2,3,6,9,8,7,4,5] 

Example 2:
Input: matrix = [[1,2,3,4],
                [5,6,7,8],
                [9,10,11,12]]   
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Difficulty : medium

Approach:
1. Initialize four pointers: startRow, endRow, startCol, endCol to keep track of the current boundaries of the matrix.
2. Use a while loop to traverse the matrix in a spiral manner until the pointers meet.
3. In each iteration, traverse from left to right, then top to bottom, then rightto left, and finally bottom to top, while updating the pointers accordingly.
Time Complexity: O(m*n) where m is the number of rows and n is the number of columns in the matrix.
Space Complexity: O(m*n) for the output list that contains all the elements of the matrix in spiral order.

*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length -1;
        List<Integer> spiral = new ArrayList<>();
 
        while(startrow <= endrow  && startcol <= endcol){
            //right
            for(int j = startcol; j <= endcol ; j++){
                
                spiral.add(matrix[startrow][j]);
            }
            // down
            for(int i = startrow + 1; i <= endrow ;i++){
                spiral.add(matrix[i][endcol]);
            }
            //left
            if(startrow < endrow){
                for( int j = endcol-1 ; j>= startcol ;j--){
                
                spiral.add(matrix[endrow][j]);
                }
            }
            //up
            if(startcol < endcol){
                for( int i = endrow-1; i >= startrow +1 ; i--){
                
                spiral.add(matrix[i][startcol]);
                
                }
            }
            
            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
        System.out.println();
        return spiral;
    }
    
}