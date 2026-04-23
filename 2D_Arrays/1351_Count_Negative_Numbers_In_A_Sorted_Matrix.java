/*
1351. Count Negative Numbers in a Sorted Matrix
Given a m * n matrix grid which is sorted in non-increasing order both row-wise and
column-wise, return the number of negative numbers in grid.
Example 1:
Input: grid = [[4,3,2,-1],
                [3,2,1,-1],
                [1,1,-1,-2],
                [-1,-1,-2,-3]]  
Output: 8   
Example 2:
Input: grid = [[3,2],
                [1,0]]  
Output: 0   
Difficulty : easy

Approach:
1. Start from the top-right corner of the matrix and initialize a count variable to keep track
of the number of negative numbers.
2. If the current number is negative, then all the numbers below it in the same column  
are also negative, so we can add the count of those numbers to our total count and move left to the next column.
3. If the current number is non-negative, then we move down to the next row to
check for negative numbers.
Time Complexity: O(m + n) where m is the number of rows and n is the number of columns in the matrix.
Space Complexity: O(1) since we are using only a constant amount of extra space for
the count variable and the pointers.
*/

class Solution {
    public int countNegatives(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int i = 0, j = n - 1;
        int count = 0;
        
        while(i < m && j >= 0){
            
            if(grid[i][j] < 0){
                count += (m - i);
                j--;
            } else {
                i++;
            }
        }
        return count;
        }
    }


