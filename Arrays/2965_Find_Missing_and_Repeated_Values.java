/*
Given a 2D grid of size n x n, where each cell contains an integer from 1 to n^2, find the missing and repeated values in the grid. The grid is supposed to contain all integers from 1 to n^2 exactly once, but one integer is missing and another integer is repeated.

Example 1: Input: grid = [[1,2,3],[4,5,6],[7,8,8]] Output: [8,9]
Explanation: The integer 8 is repeated and the integer 9 is missing.

Example 2: Input: grid = [[1,1],[2,3]] Output: [1,4]
Explanation: The integer 1 is repeated and the integer 4 is missing.    

Constraints:
1 <= n <= 100
grid.length == n
grid[i].length == n
1 <= grid[i][j] <= n^2

Difficulty: Easy

Approach:
1. Create an array of size n^2 + 1 to count the frequency of each integer in the grid.
2. Iterate through the grid and increment the count for each integer found.
3. After counting, iterate through the count array to find the missing integer (count of 0) and the repeated integer (count of 2).
Time Complexity: O(n^2)
Space Complexity: O(n^2) due to the count array.
*/

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        int size = n*n;
        int arr[] = new int[size + 1];
        
       
        for(int i =0 ; i<n;i++){

            for(int j = 0; j<n;j++){

                
                arr[grid[i][j]]++;
                
            }

        }

        int max = -1;
        int low = -1;
        for(int i = 1;i<=size;i++){
            if(arr[i] == 0){
                max = i;
            }
            if(arr[i] == 2){
                low = i;
            }
        }
    return new int[]{low,max};

    }
}

