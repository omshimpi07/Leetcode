"""
118. Pascal's Triangle

You are given an integer numRows.
Return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it and the first and last number on each row must be equal to 1, as shown below:

Example 1: Input: numRows = 5 Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

DIfficulty : Easy

"""

class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        triangle = []

        for i in range(numRows):

            row = []

            row.append(1)

            for j in range(1, i):

                left = triangle[i - 1][j - 1]
                right = triangle[i - 1][j]

                row.append(left + right)

            if i > 0:
                row.append(1)

            triangle.append(row)

        return triangle