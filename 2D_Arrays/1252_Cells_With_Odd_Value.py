"""
1252. Cells with Odd Values in a Matrix

There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
For each location indices[i], do both of the following:
Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

Example 1: Input: m = 2, n = 3, indices = [[0,1],[1,1]] Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

Difficulty : easy ; But optimization is tricky.

Time Complexity : O(m + n + indices.length)
Space Complexity : O(m + n)

"""
  
  class Solution:
    def oddCells(self, m: int, n: int, indices: list[list[int]]) -> int:
        # matrix = [[0] * n for _ in range(m)]

        # for i in range(len(indices)):

        #     r = indices[i][0]
        #     c = indices[i][1]

        #     for j in range(n):
        #         matrix[r][j] += 1

        #     for j in range(m):
        #         matrix[j][c] += 1

        # count = 0

        # for i in range(m):
        #     for j in range(n):

        #         if matrix[i][j] % 2 != 0:
        #             count += 1

        # return count

        row_count = [0] * m
        col_count = [0] * n

        for i in range(len(indices)):

            r = indices[i][0]
            c = indices[i][1]

            row_count[r] += 1
            col_count[c] += 1

        odd_rows = 0
        odd_cols = 0

        for x in row_count:
            if x % 2 != 0:
                odd_rows += 1

        for x in col_count:
            if x % 2 != 0:
                odd_cols += 1

        even_rows = m - odd_rows
        even_cols = n - odd_cols

        return odd_rows * even_cols + even_rows * odd_cols