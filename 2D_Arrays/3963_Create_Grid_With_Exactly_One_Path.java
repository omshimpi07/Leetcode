/*
3963. Create Grid With Exactly One Path

You are given two integers m and n, representing the number of rows and columns of a grid.
Construct any m x n grid consisting only of the characters '.' and '#', where:
'.' represents a free cell.
'#' represents an obstacle cell.
A valid path is a sequence of free cells that:

Starts at the top-left cell (0, 0).
Ends at the bottom-right cell (m - 1, n - 1).
Moves only:
Right, from (i, j) to (i, j + 1), or
Down, from (i, j) to (i + 1, j).
Return any grid such that there is exactly one valid path from the top-left cell to the bottom-right cell.

Example 1: Input: m = 2, n = 3 Output: ["..#","#.."]
Explanation: The only valid path is: (0,0) → (0,1) → (1,1) → (1,2)

Difficulty : Easy 

*/

class Solution {
    public String[] createGrid(int m, int n) {
        
        
        char arr[][] = new char[m][n];

        for(int i = 0; i< m ; i++){

            for(int j = 0 ; j< n ; j++){

                arr[i][j] = '#';
            }
        }

        for(int j = 0; j < n  ; j++){

            arr[0][j] = '.';
        }

        for(int i = 0  ; i< m  ; i++){

            arr[i][n- 1] = '.';
        }

        String[] result = new String[m];

        for (int i = 0; i < m; i++) {
            result[i] = new String(arr[i]);
        }

        return result;

    }
}