/*
62. Unique Paths
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

Example 1: Input: m = 3, n = 7 Output: 28

Example 2: Input: m = 3, n = 2 Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down

Difficulty : medium

Approach : Dynamic Programming.
1. Create a 2D array dp of size m x n, where dp[i][j] represents the number of unique paths to reach cell (i, j).
2. Initialize the first row and first column of dp to 1, since there is only
    one way to reach any cell in the first row (by moving right) and any cell in the first column (by moving down). 
3. Iterate through the grid starting from cell (1, 1) to cell (m-1, n-1). For each cell (i, j), calculate the number of unique paths to reach it by summing the unique paths to reach the cell directly above it (dp[i-1][j]) and the cell directly to the left of it (dp[i][j-1]).
4. The final answer will be stored in dp[m-1][n-1], which
represents the number of unique paths to reach the bottom-right corner of the grid.

Time Complexity: O(m*n) where m is the number of rows and n is the number of columns, since we are iterating through each cell of the grid once.
Space Complexity: O(m*n) for the dp array storing the number of unique paths to each cell in the grid.


*/

class Solution {

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }

        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }

        for(int i = 1; i < m; i++){

            for(int j = 1; j < n; j++){

                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        return dp[m-1][n-1];
    }
}