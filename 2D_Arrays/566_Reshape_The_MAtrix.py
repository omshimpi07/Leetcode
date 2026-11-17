"""
566. Reshape the Matrix

In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1: Input: mat = [[1,2],[3,4]], r = 1, c = 4 Output: [[1,2,3,4]]

Difficulty : Easy
"""

class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        # m = len(mat)
        # n = len(mat[0])

        # if m * n != r * c:
        #     return mat

        # result = [[0] * c for _ in range(r)]

        # idx = 0

        # for i in range(m):
        #     for j in range(n):

        #         new_row = idx // c
        #         new_col = idx % c

        #         result[new_row][new_col] = mat[i][j]
        #         idx += 1

        # return result

        m = len(mat)
        n = len(mat[0])

        if m * n != r * c:
            return mat

        # Step 1: Flatten original matrix
        temp = [0] * (m * n)

        idx = 0

        for i in range(m):
            for j in range(n):
                temp[idx] = mat[i][j]
                idx += 1

        # Step 2: Create new matrix
        result = [[0] * c for _ in range(r)]

        # Step 3: Fill new matrix
        idx = 0

        for i in range(r):
            for j in range(c):
                result[i][j] = temp[idx]
                idx += 1

        return result
    