"""
1380. Lucky Numbers in a Matrix

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1: Input: matrix = [[3,7,8],[9,11,13],[15,16,17]] Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2: Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]] Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Difiiculty : Easy

"""

class Solution:
    def luckyNumbers(self, matrix: list[list[int]]) -> list[int]:
        m = len(matrix)
        n = len(matrix[0])

        row_min = [float("inf")] * m
        col_max = [float("-inf")] * n

        # Find minimum in each row
        # and maximum in each column
        for i in range(m):
            for j in range(n):

                row_min[i] = min(row_min[i], matrix[i][j])
                col_max[j] = max(col_max[j], matrix[i][j])

        result = []

        # Find elements that are both
        # minimum in their row and maximum in their column
        for i in range(m):
            for j in range(n):

                if (
                    matrix[i][j] == row_min[i]
                    and matrix[i][j] == col_max[j]
                ):
                    result.append(matrix[i][j])

        return result