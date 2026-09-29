/*
1380. Lucky Numbers in a Matrix

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1: Input: matrix = [[3,7,8],[9,11,13],[15,16,17]] Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2: Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]] Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Difiiculty : Easy

*/

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMin = new int[m];
        int[] colMax = new int[n];

        Arrays.fill(rowMin, Integer.MAX_VALUE);
        Arrays.fill(colMax, Integer.MIN_VALUE);

        // Find minimum in each row
        // and maximum in each column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();

        // Find elements that are both
        // minimum in their row and maximum in their column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == rowMin[i] &&
                    matrix[i][j] == colMax[j]) {

                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}