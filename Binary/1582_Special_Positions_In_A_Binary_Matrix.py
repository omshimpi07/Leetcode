"""
1582. Special Positions in a Binary Matrix

Given an m x n binary matrix mat, return the number of special positions in mat.
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

Example 1 Input: mat = [[1,0,0],[0,0,1],[1,0,0]] Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

Dificulty : easy

Approach:
1. Count the number of 1s in each row and each column.
2. Iterate through the matrix and check if a position (i, j) is special by verifying that mat[i][j] == 1 and both row_count[i] and col_count[j] are equal to 1.
3. Return the count of special positions.

Time Complexity: O(m * n) where m is the number of rows and n is the number of columns in the matrix.
Space Complexity: O(m + n) for storing the counts of 1s in each row and column.
"""

class Solution:
    def numSpecial(self, mat: list[list[int]]) -> int:
        m = len(mat)
        n = len(mat[0])

        row_count = [0] * m
        col_count = [0] * n

        # Step 1: Count ones in every row and column
        for i in range(m):
            for j in range(n):

                if mat[i][j] == 1:
                    row_count[i] += 1
                    col_count[j] += 1

        # Step 2: Find special positions
        count = 0

        for i in range(m):
            for j in range(n):

                if (
                    mat[i][j] == 1
                    and row_count[i] == 1
                    and col_count[j] == 1
                ):
                    count += 1

        return count