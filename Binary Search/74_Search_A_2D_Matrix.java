/* 
74. Search a 2D Matrix
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
Integers in each row are sorted from left to right.The first integer of each row is greater than the last integer of the previous row.

Example 1: Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 Output: true
Example 2: Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13 Output: false

Constraints: m == matrix.length || n == matrix[i].length
1 <= m, n <= 100-10^4 <= matrix[i][j], target <= 10^4

Difficulty: Medium

Approach:
1. Treat the 2D matrix as a 1D sorted array and use binary search to find the target.
2. Calculate the mid index and convert it back to 2D indices to access the matrix elements.
Time Complexity: O(log(m*n)) which simplifies to O(log m + log n)
Space Complexity: O(1)

*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0;
        int right = rows * cols - 1;
        
        while (left <= right) {
    
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];
            if (midValue == target) {
                return true; 
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;a
            }
        }
        return false; 
    }
}