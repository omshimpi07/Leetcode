/*
1260. Shift 2D Grid

Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

In one shift operation:

Element at grid[i][j] moves to grid[i][j + 1].
Element at grid[i][n - 1] moves to grid[i + 1][0].
Element at grid[m - 1][n - 1] moves to grid[0][0].
Return the 2D grid after applying shift operation k times.

Example 1: Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1 Output: [[9,1,2],[3,4,5],[6,7,8]]
Example 2: Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4 Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
Example 3: Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9 Output: [[1,2,3],[4,5,6],[7,8,9]]

Difficulty : easy

Approach : 2D Array.
1. Calculate the total number of elements in the grid (m * n).
2. Use modulo operation to reduce k to a value within the range of total elements (k %= total).
3. Create a new 2D list to store the shifted grid.
4. Iterate through each element in the original grid, calculate its new position after k shifts, and place it in the new grid.

Time Complexity: O(m * n) where m is the number of rows and n is the number of columns in the grid, since we are iterating through each element once.
Space Complexity: O(m * n) for the new grid that stores the shifted elements.

*/

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k %= total;

        List<List<Integer>> ans = new ArrayList<>();

        // Initialize the result grid
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            ans.add(row);
        }

        // Place each element at its new position
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int oldIndex = i * n + j;
                int newIndex = (oldIndex + k) % total;

                ans.get(newIndex / n).set(newIndex % n, grid[i][j]);
            }
        }

        return ans;
    }
}
